package com.hanqi.javase.chapter10_static_final;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7};
        System.out.println(ArrayUtils.printArray(arr));
        System.out.println(ArrayUtils.getAverage(arr));
    }
}
