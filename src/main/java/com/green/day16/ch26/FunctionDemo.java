package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] arr = { 10, 20, 30, 40, 50 };

        //배열 안에서 가장 큰 숫자 리턴
        Function<Integer[], Integer> fn = colls -> {
            int max = colls[0];
            for (int i = 1; i < colls.length; i++) {
                if (max < colls[i]) {
                    max = colls[i];
                }
            }
            return max;
        };

        int maxValue = fn.apply(arr);
        System.out.println("maxValue: " + maxValue);
    }
}
