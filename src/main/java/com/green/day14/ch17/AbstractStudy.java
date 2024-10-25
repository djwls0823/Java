package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*
    p.380 추상 클래스

    class 키워드 앞에 abstract 키워드를 붙이면 추상 클래스가 된다.
    추상 클래스가 되면 객체화 불가능 >> 부모 역할만 한다. (단독으로는 의미가 없다.)
    그래서 추상 클래스를 상속 받는 클래스가 있기 마련이다.

    class 앞에 abstract를 붙이는 것은 선택사항이나, 만약에 추상 메소드를 가지게 된다면
    선택사항이 아니라 필수사항이 된다.

    클래스간의 공통적인 부분을 부모에 작성해서 상속 받도록 하기 위한 것.
    그리고 추상 메소드를 구현 해야하는 강제성이 존재한다.
    추상 메소드 구현: implements, 구현한다라고 표현. (구현부를 만드는 행위)
     */

    //추상 메소드 정의 (선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다.
    // 그리고 abstract 키워드를 붙여야 한다.)
    public abstract void sum();

    //추상 클래스도 구현부가 있는 메소드 가질 수 있다.
    public void multiply(int n1, int n2) {
        System.out.println(n1 * n2);
    }
}

abstract class ImplementsStudy2 extends AbstractStudy {

}

class ImplementsStudy extends AbstractStudy {
    //꼭 부모의 추상 메소드를 구현해야 한다.
    @Override
    public void sum() {
        //분명히 내용이 있을 것.
        System.out.println("숫자 더했다.");
    }
}

class AbstractStudyTest {
    public static void main(String[] args) {
        //AbstractStudy as = new AbstractStudy(); //추상 클래스라서 객체화 불가능
        AbstractStudy as2 = new ImplementsStudy();
        as2.sum(); //AbstractStudy는 sum 메소드를 알고 있다. 고로 호출 가능하다.
    }
}