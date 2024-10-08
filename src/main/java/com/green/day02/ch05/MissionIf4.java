package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        if (score == 100 || score >= 98) {
            System.out.println("A+");
        } else if (score >= 94) {
            System.out.println("A0");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 88) {
            System.out.println("B+");
        } else if (score >= 84) {
            System.out.println("B0");
        } else if (score >= 80) {
            System.out.println("B-");
        } else if (score >= 78) {
            System.out.println("C+");
        } else if (score >= 74) {
            System.out.println("C0");
        } else if (score >= 70) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }
        System.out.println("-----------");

        char grade = 'D', opt = '0';

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            } else {
                opt = ' ';
            }
        }
        System.out.printf("%c%c\n",grade, opt);
    }

}
