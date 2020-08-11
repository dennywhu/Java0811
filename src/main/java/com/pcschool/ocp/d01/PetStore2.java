
package com.pcschool.ocp.d01;


public class PetStore2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat.ctype ="波斯貓";
        c1.name="小花";c1.cage=2;c1.camount=8;c1.cprice=12000;
        c2.name="柯南";c2.cage=7;c2.camount=5;c2.cprice=500;
        
        System.out.printf("品種：%s 名字: %s 年齡: %d 數量: %d 價格: %,d 小計：%,d\n",Cat.ctype,c1.name,c1.cage,c1.camount,c1.cprice,c1.camount*c1.cprice);
        System.out.printf("品種：%s 名字: %s 年齡: %d 數量: %d 價格: %,d 小計: %,d\n",Cat.ctype,c2.name,c2.cage,c2.camount,c2.cprice,c2.camount*c2.cprice);
        int sum = (c1.camount*c1.cprice+c2.camount*c2.cprice);
               
        System.out.printf("Cat總資產: %,d\n",sum);
                
        
        
    }
}
