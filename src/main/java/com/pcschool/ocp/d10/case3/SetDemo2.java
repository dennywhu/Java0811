package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        //集合預設可以放入任意object資料
        set.add("國文");
        set.add(new Integer(100));
        set.add("英文");
        set.add(80);//new Integer或integer.valueof(80)
        set.add("數學");
        set.add(90);
        System.out.println(set);
        //尋訪器(遍瀝每一個元素)
        Iterator iter = set.iterator();
        while (iter.hasNext()) {            //確認是否有元素
            Object next = iter.next();      //取得元素內容
            System.out.println(next);       //印出元素內容
            
        }//國文,100英文,80,數學 90
        int sum = 0;
        iter= set.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer){
                sum += (Integer)next;
            }                      
        }
        System.out.println(sum);
        //java8
        sum = set.stream()
                .filter(s -> s instanceof Integer)
                .mapToInt(i -> (Integer)i)
                .sum();
        System.out.println(sum);
    }
}
