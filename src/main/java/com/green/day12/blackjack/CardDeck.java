package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int selectedIdx = 0; //외부에 줘야할 카드의 index값

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};

        int idx = 0;
        for (int i = 0; i < patterns.length; i++) { //0, 1, 2, 3
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) { // 1~13
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);
            }
        }

        shuffle();
    }

    private void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int) (Math.random() * cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
    }

    //주소값 하나씩 리턴, 리턴 주소값 지워야되고, selectedIdx 이용하여 해결
    public Card draw() {
        if (selectedIdx == 52) {
            return null;
        }
        Card tmp = cards[selectedIdx];
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;
    }

    public void checkCards() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public String getDenomination(int n) {
        if (n < 1 || n > 13) {
            return "";
        }
        switch(n) {
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
            case 13: return "K";
            default: return String.valueOf(n);
        }
    }
}