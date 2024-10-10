package com.green.day03.ch05;

public class MissionContinueBreakResult {
    public static void main(String[] args) {
        int i = 1;
        int odd = 0;

        while(odd < 1000) {
            if((i % 2) == 1) {
                System.out.println("마지막 더한 값 : " + i);
                odd += i;
            }
            i++;
        }
        System.out.println("1000 넘은 값 :" + odd);
    }
}
