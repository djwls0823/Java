package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        int result = 1;
        for(int i = 2; i < 11; i++){
            result *= i;
        }
        System.out.println(result);
        System.out.printf("%,d\n", result);
    }
}
