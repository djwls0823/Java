package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    /*
    다음 메소드는 int형 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr)); // { 1, 2, 3, 4, 5 }
        // for (int item : arr) {
        //     item += 3;
        // }
        //위의 for문은 배열이 가지고 있는 값을 다른데로 복사 하고 다른데를 고쳐준다.
        //배열의 각 방의 값을 고쳐야 하는데 다른 곳을 수정한다.
        //고로, 아래처럼 해야 한다.
        addOneDArr(arr, 3); //두 번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr)); // { 4, 5, 6, 7, 8 }
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        addTwoDArr(arr2, 2); //메소드 재활용성을 극대화 시킨다.
        System.out.println(Arrays.deepToString(arr2));
    }
    public static void addOneDArr(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    //int[] 객체의 각 방의 타입: int
    //int[][] 객체의 각 방의 타입: int[]
    public static void addTwoDArr(int[][] arr2, int add) {
        for (int i = 0; i < arr2.length; i++) {
            addOneDArr(arr2[i], add);
        }
    }
}
