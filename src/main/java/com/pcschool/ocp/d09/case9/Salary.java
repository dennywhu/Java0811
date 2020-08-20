package com.pcschool.ocp.d09.case9;

public enum Salary {
    Operator(23000),
    programmer(40000),
    Manager(75000),
    Boss(1);

    private Salary(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    private int money;
}
