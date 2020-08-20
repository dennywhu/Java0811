package com.pcschool.ocp.d09.case9;

public enum USCurrency {

    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private USCurrency(int value) {
        this.value = value;
    }
    private int value;
}
