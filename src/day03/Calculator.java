package day03;

import java.util.Scanner;

public class Calculator {

    //요구사항
    // 1. 두개의 정수와 +,-,*,/ 해당 연산자를 입력받아서 연산을 출력한다.
    // 2. "exit" 문자가 입력되기 전까지 사칙연산을 수행하는 루틴을 만든다.

    //생각하기
    //1. 사칙연산을 수행하는 메소드를 만든다.
    //2. 사용자 입력을 위한 입력기능
    //3. 두개의 정수 데이터와 사칙연산 구분을 위한 하나의 문자("+","-","*","/")
    //4. 만약에 "+"가 입력되었다면 덧셈연산을 한다. (덧셈기능 메소드를 호출) -if(operator.equals("+"))
    //  add(int num, int num2)
    //
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {



    }

    static void adder(int num1, int num2) { //덧셈
        int sum = num1 + num2;
        System.out.println("더한값 : " + sum);
    }

    static void minus(int num1, int num2) { //뺄셈
        int sum = num1 - num2;
        System.out.println("뺀값 : " +sum);
    }

    static void multiply(int num1, int num2) { //곱셈
        int sum = num1 * num2;
        System.out.println("곱한값 : " +sum);
    }

    static void div(int num1, int num2) { //나눗셈
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다");
        }else{
            int sum = num1 / num2;
            System.out.println("나눈값 : " +sum);
        }

    }

    void input() { //스캐너 사용
        Scanner scan = new Scanner(System.in);
        String message = "";
        do {
            System.out.println("@@@계산기 프로그램@@@");
            System.out.println("첫번째 숫자를 입력해 주세요. ");
            int num1 = scan.nextInt();
            System.out.println("두번째 숫자를 입력해 주세요. ");
            int num2 = scan.nextInt();

            System.out.println("연산자를 입력해 주세요. (+ , - , * , / )");
            char operator = scan.next().charAt(0); //이게 중요 연산자표현
            if (operator == '+') {
                adder(num1, num2);
            } else if (operator == '-') {
                minus(num1, num2);
            } else if (operator == '*') {
                multiply(num1, num2);
            } else if (operator == '/') {
                div(num1, num2);
            }
            System.out.println("종료하시려면 \"exit\" 입력하세요 ");
            message = scan.next();
            System.out.println();
        } while (!message.equals("exit"));

    }

}
