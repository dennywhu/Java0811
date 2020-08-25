package com.pcschool.ocp.d15_thread;

public class Account {
    private int balance;//與執行緒共享
    
    public Account(int balance){
        this.balance = balance;
    }
    //提款方法
    public void withdraw(int money){//money是一個方法區域變數(每一個執行緒自己會擁有一個
        
    }
    
}
