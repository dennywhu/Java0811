
package com.pcschool.ocp.Game;

import java.util.Random;


public class Number {
    private int ans = new Random().nextInt(10)+1;
    private int count = 0 ;
    public  int check(int userAns) {
        count++;
        return userAns - ans ;
    } 
    public int getCount(){
        return count;
    }
}
