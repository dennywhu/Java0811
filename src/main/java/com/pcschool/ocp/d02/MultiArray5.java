package com.pcschool.ocp.d02;

public class MultiArray5 {

    public static void main(String[] args) {
        char[][] ttt = {
            {'o', 'o', 'x'},
            {'x', 'o', ' '},
            {'x', ' ', 'x'}
        };
        ttt [2][1] ='o';
    System.out.println("O 勝利");
        //印出最後結局
        for (int i=0;i<ttt.length;i++){
            System.out.println(ttt[i]);
        }
        
    }
}
