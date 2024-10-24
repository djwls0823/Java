package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list); //[2, 3, 4]
        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}
