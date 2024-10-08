package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitchResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        System.out.printf("성별: %s, 키: %d\n", gender, height);

        int standHeight = 159;
        switch(gender) {
            case "m":
                standHeight = 172;
        }
        if(standHeight < height) {
            System.out.println("당신은 평균보다 큽니다.");
        } else if(standHeight > height){
            System.out.println("당신은 평균보다 작습니다.");
        } else {
            System.out.println("당신은 평균입니다.");
        }
    }
}