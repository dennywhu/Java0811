package com.pcschool.ocp.d08.case1;

// 約克夏
public class Yorkshire implements Pet {

    public void eat() {
        System.out.println("寶路");
    }

    @Override
    public void skill() {
        System.out.println("握手");
    }
}