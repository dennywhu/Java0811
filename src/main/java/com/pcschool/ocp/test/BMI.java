
package com.pcschool.ocp.test;

import java.util.Scanner;




public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello BMI");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高:");
        double h = sc.nextDouble();
        System.out.println("請輸入體重");
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高:%.2f  體重:%.2f BMI:%.2f\n",w,h,bmi);
        
    }
}
