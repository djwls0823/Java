package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {

        int n = 1;
        int sum = 0;

        while(n < 100) {
            sum += n++;
        }
        System.out.println("result = " + sum);
    }
}
