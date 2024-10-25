package com.green.day12.blackjack;

public class Rule {
    public void getWinner(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비긴 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우

        int dp = dealer.getPoint();
        int gp = gamer.getPoint();
        /*
        if: 비기는 경우의 수를 전부 잡아냄. 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우

        남은 경우: 둘 중의 하나가 21을 넘은 경우 or 둘 다 21을 안 넘은 경우

        else if: 딜러가 이긴 경우의 수를 전부 잡아냄.
                 딜러가 21을 안 넘으면서 게이머보다 점수가 많은 경우 >> 둘 다 21을 안 넘은 경우인데 딜러가 점수가 더 높음
                 게이머가 21을 넘었다면 >> 딜러는 21을 안 넘었을 것

        남은 경우의 수: 게이머가 이기는 경우의 수가 남았음

        else: 게이머가 이기는 경우이다.
         */
        if (dp == gp || (dp > 21 && gp > 21)) {
            System.out.println("비겼다");
        } else if ((dp > gp && dp <22) || gp >21) {
            System.out.println("딜러가 이겼다.");
        } else {
            System.out.println("게이머가 이겼다.");
        }
    }
}