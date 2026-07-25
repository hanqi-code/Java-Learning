package com.hanqi.javase.chapter06_array.lab;

public class ArrayReversePractice {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("原始数组:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println("反转后的数组:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
