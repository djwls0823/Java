package com.green.day01.ch01;

public class SystemOutPrintLn {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println();
        System.out.println(3.15);
        System.out.println("3 + 5 = " + 8); // 문자열 + 정수: 정수 8이 자동 형 변환되어 문자열이 된다.
        System.out.println(3.15 + "는 실수입니다."); // 실수 + 문자열: 실수 3.15가 자동 형 변환되어 문자열이 된다.
        /*
        문자열과 더하기를 만나면 다른 항은 무조건 문자열로 자동 형 변환이 된다.
        연산의 우선순위를 높이고 싶다면 () 소괄호를 사용하여 묶어주면 연산 순위가 올라간다.
        연산 순위가 올라가면 먼저 연산이 된다.
         */
        System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
        System.out.println(3 + 5); // 3 + 5 연산이 먼저 진행되고 결과값인 8이 println 메소드에 보내지게 된다.
    }
}
