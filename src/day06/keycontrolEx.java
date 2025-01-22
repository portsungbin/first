package day06;

import java.util.Scanner;

public class keycontrolEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("----------------------------");
            System.out.println("1. 속도증가 | 2. 감속 | 3. 중지");
            System.out.println("----------------------------");
            System.out.print("선택하세요. ");

            String strNum = scan.nextLine();

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재속도 : " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재속도 : " + speed);
            } else if (strNum.equals("3")) {
                run = false;
            } else {
                System.out.println("잘못 입력되었습니다. 다시 선택해주세요");
                continue;
            }


        }


        System.out.println("종료 되었습니다");


    }
}
