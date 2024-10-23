package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCls sub1 = new SubCls();
        sub1.showCount();; // 3
    }
}

class SuperCLS {
    protected static int count;
    SuperCLS() {
        count++;
    }
}
class SubCls extends SuperCLS {
    SubCls() {
        super();
    }
    void showCount() {
        System.out.println("count: " + count);
    }
}