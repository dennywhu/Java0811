package com.pcschool.ocp.d02;

public class MultiArray4 {

    public static void main(String[] args) {
        //三維陣列
        int[][][] x = {
            {{100, 90, 80}, {70, 60}},
            {{70, 60}, {50}}
        };
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        System.out.println(x[0][0][0]);
        for (int k = 0; k < x.length; k++) {
            for (int i = 0; i < x[k].length; i++) {
                for (int j = 0; j < x[k][i].length; j++) {
                    System.out.println(x[k][i][j]);
                }
            }
            
        }
    }
}
