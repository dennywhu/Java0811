package com.pcschool.ocp.d01;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class ArrayTest3 {

    public static void main(String[] args) {
        double[] h = {172, 168, 164, 170, 176};
        //Java7
        double avg = 0;
        double sum = 0;
        for (int i = 0, len = h.length; i < h.length; i++) {
            sum += h[i];
        }
        avg = sum / h.length;
        System.out.printf("平均: %.2f\n", avg);

        double max = 0;
        for (int i = 0; i < h.length; i++) {
            if (h[i] > max) {
                max = h[i];
        }
        }
        System.out.printf("最高:%.2f cm\n", max);
        //最小值
        double min = 1000;
        for(int i = 0;i <h.length;i++ ){
            if (h[i]<min){
                min = h[i];
            }
        }
        System.out.printf("最小:%.2f cm\n", min);
        
        //Java8
        Arrays.stream(h).forEach(x -> System.out.println(x));
        sum = Arrays.stream(h).sum();
        avg = Arrays.stream(h).average().getAsDouble();
        System.out.printf("總身高: %.1f 平均身高: %.1f\n", sum, avg);
        //統計
        
        DoubleSummaryStatistics stat=Arrays.stream(h).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getSum());
    }
}
