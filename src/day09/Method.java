package day09;

import java.util.Scanner;
//짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해보자
//1.메소드의 반환값이 있는경우
//1.메소드의 반환값이 없는경우
//1.메소드의 매개변수가 있는경우
//1.메소드의 매개변수가 없는경우


public class Method {

    public static void method1() {
        System.out.println("static 메서드입니다.");
        System.out.println("5+6");
    }

    public static void method1(String message) {
        System.out.println(message);
    }

    public static void method1(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        method1();
        method1("static method1입니다");
        method1(5,6);
    }


}


