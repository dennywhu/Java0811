
package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;
import com.pcschool.ocp.d07.case1.material.Hotdog;
import java.util.Arrays;


public class Breakfast {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("火腿蛋");
        Hotdog hotdog = new Hotdog();
        sandwich.addMaterial(hotdog);
        System.out.println(sandwich.getName());
        System.out.println(sandwich.getPrice());//25
         //列印素材
        Arrays.stream(sandwich.getMaterials())
                .forEach(m -> System.out.println(m.getName()+"/"+m.getPrice()));
        
        Hamburger hamburger = new Hamburger("牛肉蛋");
        System.out.println(hamburger.getName());
        System.out.println(hamburger.getPrice());//50
        //列印
        Arrays.stream(hamburger.getMaterials())
                .forEach(m -> System.out.println(m.getName()+"/"+m.getPrice()));
       
    }    
}
