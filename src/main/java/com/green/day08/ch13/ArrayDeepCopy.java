package com.green.day08.ch13;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 23, 1, 8, 10, 12 };
        int[] copyArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("copyArr[%d]: %d\n", i, copyArr[i]);
        }
    }
}
