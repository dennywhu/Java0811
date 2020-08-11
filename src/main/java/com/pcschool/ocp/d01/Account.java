
package com.pcschool.ocp.d01;


public class Account {

private int balance;

public void save(int money){
    //存款
    if(money > 0){
    balance += money;
            }
}
//提款
public void withdraw(int money){
    if(money> 0 && balance >= money){
        balance -= money ;//balance = balance-money
        
    }
}
    //印出帳戶餘額
    public int getBalance(){
        return balance;
    }
}
