package com.hanqi.javase.chapter10_static_final;

public class ArrayUtils {
    private ArrayUtils(){}

    public static String printArray(int[] arr){
        String reslut="[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                reslut = reslut + arr[i]+ "]";
            }else{
                reslut = reslut + arr[i]+ ",";
            }
        }
        return reslut;
    }

    public static double getAverage(int[] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
      return sum / arr.length;
    }
}
