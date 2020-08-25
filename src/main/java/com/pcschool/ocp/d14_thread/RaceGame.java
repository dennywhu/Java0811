package com.pcschool.ocp.d14_thread;

public class RaceGame {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("誰舉辦\n",tName);
        Race r1 = new Race("烏龜");
        Race r2 = new Race("兔子");
        //參與人員(有幾條執行緒)
        int count = Thread.activeCount();
        System.out.printf("參與人員:%d \n",count);
        r1.start();
        r2.start();
        
    }
}
