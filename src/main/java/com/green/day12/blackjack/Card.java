package com.green.day12.blackjack;

public class Card {
    private final String pattern; //무늬
    private final String denomination; //A, 2~10, J, Q, K 값 저장
    //immutable 때문에 setter 대신 생성자 사용

    public Card(final String pattern, final String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override //재정의 한것
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
}