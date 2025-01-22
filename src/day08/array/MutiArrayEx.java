package day08.array;

import java.util.Enumeration;

public class MutiArrayEx {
    public static void main(String[] args) {
        // 정수형 2차원 배열 생성
        int[][] scores = {
                {80,90,96},
                {76,88}
        };
        //배열의 길이 1차원 배열의 길이 (반의 수)
        System.out.println(scores.length + " scores[0]" + " scores[1]");
        System.out.println(scores[0][0]);
        //scores[1] 88출력
        System.out.println(scores[1][1]);

        System.out.println();
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);


            }
        }
        System.out.println("----------------");
        //for-each 문을 이용하여 2반의 학생들의 점수 합산하고 평균을 구하여 출력하세요(평균은 소수점 첫째자리까지)
        int hap = 0;
        int count = 0;
        double avg = 0;

        for (int sum : scores[1]) {
                hap += sum;
                count++;
        }
        avg = (double) hap / scores.length;
        System.out.println("점수 합산 : " + hap);
        System.out.printf("점수 평균 : %.1f", avg);


    }
}
