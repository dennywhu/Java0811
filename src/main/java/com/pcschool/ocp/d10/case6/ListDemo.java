package com.pcschool.ocp.d10.case6;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(0,3);
        list.add(4);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(3));
        
        System.out.println(list.remove(new Integer(3)));
        System.out.println(list);
        
    }
}
