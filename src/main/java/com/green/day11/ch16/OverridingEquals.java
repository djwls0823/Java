package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        NumBox n3 = new NumBox(13);
        String s1 = new String("10");
        String s2 = new String("10");

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        //레퍼런스 변수끼리의 == 비교는 주소값 비교 (동일성 비교)
        //n1, n2는 각각 객체 생성으로 만든 주소값을 가지고 있기 때문에 주소값이 다르다.
        //즉, 2개의 NumBox 객체가 만들어졌다.
        System.out.println("n1 == n2 " + (n1 == n2));
        System.out.println("n1.equals(n2) " + n1.equals(n2)); //false >> true
        System.out.println("n1.equals(s1) " + n1.equals(s1)); //false
    }
}
class NumBox {
    private int num;

    NumBox(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof NumBox)) { //NumBox와 다른 타입이면 return false
            return false;
        }
        NumBox nb = (NumBox)object;
        //return num == nb.getNum();
        return this.num == nb.num;
    }

    //문자열로도 해결할 수 있으나 퍼포먼스가 좋지 않기 때문에 비추천
    public boolean equals2(Object object) {
        return toString().equals(object.toString());
    }

    int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
        // 메소드: ()소괄호가 보이기 때문에
        // static 메소드: 객체 생성 없이 클래스.으로 사용했기 때문에
        // 리턴타입이 String
        // 파라미터는 int타입
    }
}
