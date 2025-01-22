package day06;

import java.util.Scanner;

public class BreakEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //현재 num = 6이면 종료되는 코드를, 사용자가 exit 입력했을때 종료되는 코드로 바꿔주세요.
        while (true) {
            int num = (int) (Math.random()*6)+1;
            System.out.println(num);
//            if (num == 6) {
//                System.out.println("주사위 게임을 종료합니다");
//                break;
//            }
            System.out.println("게임을 중단 하시겠습니까? ");
            String message = scan.nextLine();
            if (message.equals("exit")) {
                break;
            }
        }

        System.out.println("프로그램 종료");

    }
}
