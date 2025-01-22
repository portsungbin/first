package day03;

import java.util.Scanner;

public class ScannerEx {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("x의 값 입력");
        String strX = scan.nextLine();
        //strX 변수값을 숫자값으로 변경하여 int x에 저장하세요
        int x = Integer.parseInt(strX);
        System.out.println(x);

        System.out.println("y의 값 입력");
        String strY = scan.nextLine();
        int y = Integer.parseInt(strY);
        System.out.println(y);

        //문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅기능을 제공하는 각 래퍼클래스를 활용하여 변경

        while (true) { //while문을 무한히 반복실행 한다.
            System.out.println("입력기능을 종료하고 싶으면 \"exit\" 입력하세요!");
            System.out.println("입력 문자열 : ");
            String data = scan.nextLine();

            if (data.equals("exit")) { //while문 브레이크방법(String)
                break;
            }
            System.out.println("입력된 문자열 출력 : " + data);
        }

        System.out.println("프로그램 종료");

    }
}
