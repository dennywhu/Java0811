
package com.pcschool.ocp.d08.case3;

import java.util.Arrays;

public class PetStore {
    public static void main(String[] args) {
        Pet[] pets = {new EDog(),new Yorkshire(),new Chihuahua(),new Persian()};
        
        //狗吃那些東西
        Arrays.stream(pets).filter(p ->p instanceof Dog).forEach(p -> p.eat());
        System.out.println("-------------------");
        //貓都吃那些東西
        Arrays.stream(pets).filter(p ->p instanceof Cat).forEach(p -> p.eat());
        
        //總共有幾隻腳
        long amount = Arrays.stream(pets).count();
        System.out.println(amount*Pet.legs);
    }
}
