
package com.pcschool.ocp.d02;


public class StringTest2 {
    public static void main(String[] args) {
        String S1 = "Java";
        String S2 = "Java";
        String S3 = new String("Java");//s3在pool外面
        System.out.println(S1 ==S2);
        System.out.println(S1.equals(S2));
        System.out.println(S1 == S3);
        S3 = S3.intern();//s3在pool裡面
        System.out.println(S1 == S3);
               
    }
}
