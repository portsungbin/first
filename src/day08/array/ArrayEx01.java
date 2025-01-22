package day08.array;

//변수는 하나의 값만 저장한다 저장해야 할 값들이 많아지면 값들이 늘어난 만큼 변수도 늘어나야 한다.
// 많은 양의 값을 좀 더 효율적으로 관리, 운영할 수 없을까? 배열
//배열은 연속된(index, 방번호, 항상 0 부터 시작) 공간에 값을 나열시킨다.
//배열은 연속된 공간에 값을 나열시키고, 각 값의 인덱스를 부여한 자료구조이다.


// 학생10명의 성적을 저장하고 평균을 구하는 프로그램

public class ArrayEx01 {
    public static void main(String[] args) {
        int sum = 0;
        int[] scores = new int[]{90,80,70,60,55,90,77,66,99,100};

        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        double avg = (double) sum / scores.length;
        System.out.printf("10명의 학생 총합 : %d, 평균 : %.1f", sum, avg);

    }
}
