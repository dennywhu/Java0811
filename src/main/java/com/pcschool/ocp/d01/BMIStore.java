
package com.pcschool.ocp.d01;


public class BMIStore {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name="John";b1.h=170;b1.w=60;
        b1.setBMI();
        
        BMI b2 = new BMI();
        b2.name="Mary";b2.h=180;b2.w=55;
        b2.setBMI();
        
        System.out.printf("%s bmi=%.2f\n",b1.name,b1.getBMI());
        System.out.printf("%s bmi=%.2f\n",b2.name,b2.getBMI());
    }
}
