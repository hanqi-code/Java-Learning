package com.hanqi.javase.chapter07_method.lab;

public class MethodReturnArrayPractice {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.print("原数组：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        System.out.print("反转后的新数组：");
        int[] newNums = reverseArray(nums);
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i]+" ");
        }

    }

    public static int[] reverseArray(int[] nums){
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            result[left] = nums[right];
            result[right] = nums[left];
            left++;
            right--;
        }
        return result;
    }
}
