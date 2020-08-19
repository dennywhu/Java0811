package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Fighter(),new Fighter(),new Fighter()};
        Car [] cars = {new Tank(),new Truck(),new Truck(),new Tank()};
        Weapon[] weapons = {new Fighter(),new Tank()};
        //統一發射武器
        for(Car car:cars){
            if(car instanceof Tank) {
                ((Tank)car).shoot();
            }
        }
        //weapons要統一發射
        for(Weapon w : weapons){
            w.shoot();
        }
        //weapons統一發射JAVA8
        Arrays.stream(weapons).forEach(w -> w.shoot());
        //car統一發射
        System.out.println("----------我是分隔線------------");
        Arrays.stream(cars)
                .filter(c -> c instanceof Weapon)
                .map(c -> (Weapon)c).forEach(c -> c.shoot());
               
        
    }
}