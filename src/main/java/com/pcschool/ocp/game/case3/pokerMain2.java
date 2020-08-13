
package com.pcschool.ocp.game.case3;

import java.io.File;
import java.util.Scanner;


public class pokerMain2 {
    public static void main(String[] args) {
        
    
    //指定檔案位置
    File f = new File("src\\main\\java\\com\\pcschool\\ocp\\game\\case3\\poker.txt");
    //透過Scanner抓取
    Scanner sc = new Scanner(f);
    //將檔案內容全部
    String allData = sc.useDelimiter("\\A").next();
    //列印
    System.out.println(allData);
    //透過split切分資料
    String[] rows = allData.split("\n");
    //抓第一筆
        System.out.println(rows[0]);
    }
}
