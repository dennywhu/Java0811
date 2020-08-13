
package com.pcschool.ocp.game.case3;


public class Poker {
    public String mark;//花色
    public String name;//號碼
    public String color;//顏色
    public int value;//價值
   //建構式
    public Poker(String mark, String name, String color, int value) {
        this.mark = mark;
        this.name = name;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Poker{" + "mark=" + mark + ", name=" + name + ", color=" + color + ", value=" + value + '}';
    }

    
    }
       
    

