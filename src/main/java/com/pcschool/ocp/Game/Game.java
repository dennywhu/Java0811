
package com.pcschool.ocp.Game;

import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Number number = new Number();
        while (true){
            Scanner sc = new Scanner (System.in);
            System.out.print("請輸入數字: ");
            int userAns = sc.nextInt();
            int result = number.check(userAns);
            if(result==0) {
                System.out.println("恭喜答對了");
            } else {
                System.out.printf("猜第 %d 次 結果:猜%s了\n",number.getCount(),result>0?"大":"小");
                //contunue
            }
        }
    }
}