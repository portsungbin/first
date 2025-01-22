package day04;

import java.util.Scanner;

public class CompareOpertorEx {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 10;
        boolean result1 = false;
        //1. n1과 n2의 값이 같은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 == n2;
        System.out.println(result1);
        //2. n1과 n2의 값이 다른지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 != n2;
        System.out.println(result1);
        //3. n1과 n2의 값이 n1이 n2보다 작거나 같은지 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 <= n2;
        System.out.println(result1);
        //4. n1과 n2의 값이 n1이 n2보다 크거나 같은지 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 >= n2;
        System.out.println(result1);
        //5. n1과 n2의 값이 n1이 n2보다 작은지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 < n2;
        System.out.println(result1);
        //6. n1과 n2의 값이 n1이 n2보다 큰지를 비교하여 결과를 boolean result1에 저장 후 result1 출력
        result1 = n1 > n2;
        System.out.println(result1);

//        //7. jongol 연산자 자가진단 5번
//
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        System.out.println(a == b ? 1 : 0);
//        System.out.println(a != b ? 1 : 0);

        //문자 비교
        char ch1 = 'A';
        char ch2 = 'B';
        result1 = (ch1 < ch2);
        System.out.println(result1);

        //실수 비교
        int n5 = 1;
        double n6 = 1.0;
        result1 = (n5 == n6);
        System.out.println(result1);

        float n7 = 0.1f;
        n6 = 0.1;
        result1 = (n7 == n6);
        System.out.println(result1);
        result1 = ((float)n7 == n6);
        System.out.println(result1);
//부동소수점 값의 정확도 차이로 인한 비교 오류로 다른수로봄






    }
}
