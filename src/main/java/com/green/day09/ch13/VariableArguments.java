package com.green.day09.ch13;

public class VariableArguments {
    //가변 인수
    public static void main(String[] args) {
        sum(1, 2);

        sum(10, 22, 33);

        sumVar(1); //[1]
        sumVar(1, 2); //[1, 2]
        sumVar(1, 2, 3); //[1, 2, 3]
        sumVar(1, 2, 3, 1, 2, 3);
    }
    static void sumVar(int... values) { //배열로 변환이 되어서 파라미터로 들어온다.
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        System.out.println(sum);
    }

    static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
}
