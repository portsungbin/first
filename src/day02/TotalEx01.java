package day02;
import java.util.Scanner;

public class TotalEx01 {
    static Scanner scan = new Scanner(System.in);

    static void fourArithmetic() {
        System.out.print("첫번째 숫자를 입력해 주세요. : ");
        int a = scan.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요. : ");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.printf("a+b= %d%n", sum);
        sum = a - b;
        System.out.printf("a-b= %d%n", sum);
        sum = a * b;
        System.out.printf("a*b= %d%n", sum);
        sum = a / b;
        System.out.printf("a/b= %d%n", sum);;
    }

    static void operaor() {
        System.out.print("국어 성적을 입력하세요 : ");
        int kor = scan.nextInt();
        System.out.print("영어 성적을 입력하세요 : ");
        int eng = scan.nextInt();
        int total = 0;
        double avg = 0.0;

        total = kor + eng;
        avg = total / 2.0;

        System.out.printf("총점: %d%n",total);
        System.out.printf("평균: %.1f", avg);
    }


    public static void main(String[] args) {
        fourArithmetic();
        operaor();
    }
}
