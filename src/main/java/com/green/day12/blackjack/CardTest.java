package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();

        Card c = cd.draw();
        Card c2 = cd.draw();
        System.out.println();
        cd.checkCard();

        while (true) {
            Card draw = cd.draw();
            if (draw == null) {
                break;
            }
            System.out.println(cd.draw());
        }
    }
}