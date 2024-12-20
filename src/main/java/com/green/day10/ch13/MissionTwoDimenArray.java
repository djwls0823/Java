package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, //영수
                {90, 90, 80}, //상철
                {80, 70, 60} //광수
        };
        /*
        영수: 합계 점수, 평균 점수
        상철: 합계 점수, 평균 점수
        광수: 합계 점수, 평균 점수
        국어: 합계 점수, 평균 점수
        영어: 합계 점수, 평균 점수
        수학: 합계 점수, 평균 점수
        학급: 합계 점수, 평균 점수
         */

        String[] names = {"영수", "상철", "광수"};
        int[] namesScore = new int[names.length];

        String[] subjects = {"국어", "영어", "수학"};
        int[] subjectsScore = new int[subjects.length];

        //각 이름별, 과목별 합계값 구하는 부분
        for(int i=0; i<score.length; i++) {
            for(int i2=0; i2<score[i].length; i2++) {
                namesScore[i] += score[i][i2]; //학생별 합계 점수 정리
                subjectsScore[i2] += score[i][i2]; //과목별 합계 점수 정리
            }
        }

        int totalScore = 0;
        //학생 별 합계점수, 평균점수 출력하는 부분
        for(int i=0; i<names.length; i++) {
            totalScore += namesScore[i];
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , names[i], namesScore[i], (float)namesScore[i] / subjects.length);
        }
        System.out.println("--------------------------------");
        //과목 별 합계점수, 평균점수 출력하는 부분
        for(int i=0; i<subjectsScore.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n"
                    , subjects[i], subjectsScore[i], (float)subjectsScore[i] / names.length);
        }
        System.out.println("--------------------------------");
        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n"
                , totalScore, (float)totalScore / (names.length * subjects.length));
    }
}
