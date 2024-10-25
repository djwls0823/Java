package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장할 수 있어야 한다.
    //ArrayList 사용
    //멤버필드 선언. 변수명은 cards
    protected final List<Card> cards;
    protected int point;

    public Gamer() {
        cards = new ArrayList();
    }

    public void receiveCard(Card c1) {
        //new switch expression
        this.point = switch(c1.getDenomination()) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };
        this.point += point;
        cards.add(c1);
//        String str = "10";
//        int val = Integer.parseInt(str); //val 변수명에 10 정수값이 주입된다.
    }

    public int getPoint() {
        return point;
    }

    public void showYourCards() {
//        for (int i = 0; i < cards.size(); i++) {
//            System.out.println(cards.get(i));
//        }
        for (Card cards : cards) {
            System.out.println(cards);
        }
    }

    public List<Card> openCards() {
        return cards;
    }
}