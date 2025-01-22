package day09;

import java.util.Scanner;
//짝홀수를 판별하는 코드를 메서드 두가지 유형으로 작성해보자
//1.메소드의 반환값이 있는경우
//1.메소드의 반환값이 없는경우
//1.메소드의 매개변수가 있는경우
//1.메소드의 매개변수가 없는경우


public class Welcome {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 이름을 입력하세요 : ");
            String a= scan.nextLine();
            System.out.println("연락처를 입력하세요 : ");
            int b = scan.nextInt();
        }



    }
}


