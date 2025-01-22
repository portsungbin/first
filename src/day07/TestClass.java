package day07;
import java.util.Scanner;


class car {
    String color;

    void colorReturn(String a) {
        System.out.println("자동차 색은 " + this.color + a);
    }
}


public class TestClass {
    public static void main(String[] args) {

        int number = 1;
        Scanner scan = new Scanner(System.in);
        car car1 = new car();
        car car2 = new car();

//        System.out.println(number);
//        System.out.println(scan.getClass());

        car1.color = "red";
        car2.color = "blue";


        car1.colorReturn(" 1");


    }
}
