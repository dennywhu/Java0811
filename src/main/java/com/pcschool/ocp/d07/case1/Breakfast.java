
package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;


public class Breakfast {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("火腿蛋");
        System.out.println(sandwich.getName());
        System.out.println(sandwich.getPrice());//25
        
        //Hamburger hamburger = new Hamburger("牛肉蛋");
        //System.out.println(hamburger.getName());
        //System.out.println(hamburger.getPrice());//50
    }
}
