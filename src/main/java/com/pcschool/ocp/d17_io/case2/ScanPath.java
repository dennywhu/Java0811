package com.pcschool.ocp.d17_io.case2;

import java.io.File;

public class ScanPath {
    public static void main(String[] args) {
        File path = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io");
    for(String f name : path.list()){
        System.out.println(fname);
    }
    }
}
