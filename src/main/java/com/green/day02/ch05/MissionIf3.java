package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scan.nextInt();
        System.out.printf("input : %d\n", input);

        if (input % 2 == 1) {
            System.out.printf("%d는(은) 홀수입니다.\n", input);
        } else {
            System.out.printf("%d는(은) 짝수입니다.\n", input);
        }
        System.out.println("------------------");

        char result = (input % 2 == 0 ? '짝': '홀');
        System.out.printf("%d는(은) %c수입니다.\n", input, result);

        String result2 = (input % 2 == 0 ? "짝": "홀");
        System.out.printf("%d는(은) %s수입니다.\n", input, result2);

        System.out.println("-- 끝 --");
    }
}
