
package com.pcschool.ocp.d07.case2;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Fish();       
        Animal animal2 = new Penguin();
       if(animal instanceof Bird){
           ((Bird)animal).move();
       }else{
           System.out.println("Fish不可轉成Bird");
       }
       ((Bird)animal2).move();
    }
}
