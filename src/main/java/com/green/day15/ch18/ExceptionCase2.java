package com.green.day15.ch18;

public class ExceptionCase2 {
    public static void main(String[] args) {
        /*
        try-catch문 (예외처리)
        try문에 에러가 날 가능성이 있는 코드를 위치한다.
        만약에 예외가 발생이 된다면 catch 부분이 실해이 된다.
        예외가 발생되지 않는다면 catch 부분이 실행되지 않는다.
        if문과 유사함
         */
        int n1 = 10;
        int n2 = 2;

        try {
            System.out.printf("%d / %d = %d \n", n1, n2, (n1 / n2));;
        } catch (ArithmeticException e) {
            e.printStackTrace(); //try-catch문이 없었다면 콘솔에서 봤을 내용을 찍는다.
            System.out.println(e.getMessage());
        }
        System.out.println("-- 종료 --");
    }
}