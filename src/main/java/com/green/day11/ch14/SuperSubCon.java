package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        new ClassC();
    }
}

//super 생성자 호출은 자식 생성자 코드에서 최상위에 위치해야 한다.
class ClassA {
    ClassA() {
        super();
        System.out.println("==== ClassA ====");
    }
}
class ClassB extends ClassA{
    ClassB() {
        super();
        System.out.println("==== ClassB ====");
    }
}
class ClassC extends ClassB{
    ClassC() {
        super();
        System.out.println("==== ClassC ====");
    }
}