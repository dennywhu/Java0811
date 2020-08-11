
package com.pcschool.ocp.d01;

//物件參考應用練習
public class RefererceTest {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String S2 = s1;
        System.out.println(s1);
        
        String s3="Hello";
        append(s3);
    }
    
    public static void append(String s){//相當於S=s3
        s=s+"Java";
        System.out.println(s);
    }
}
