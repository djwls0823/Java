package com.green.day09.ch13;

public class Mission13_1 {
    /*
    int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최댓값, 최소값을 찾아서
    반환하는 메소드를 각각 다음의 형태로 정의하자.

    public static int minValue(int[] arr) //최솟값 반환
    public static int maxValue(int[] arr) //최댓값 반환

    단 반복문을 사용할 때 minValue의 정의에서는 일반적인 for문을 사용
    maxValue의 정의에서는 enhanced-for문을 사용하자.
     */
    public static void main(String[] args) {
        int[] arr = { 43, 88, 100, 3, 220, 1, 320 };
        int min = minValue(arr); //3 리턴
        int max = maxValue(arr); // 220 리턴
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }
}
