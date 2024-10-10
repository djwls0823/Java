package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;

        while(true) {
            sum += n;
            if(sum > 1000) {
                break;
            }
            n += 2;
        }
        System.out.println("마지막 더한 값 : " + n);
        System.out.println("1000 넘은 값 :" + sum);
    }
}
