package day02;

import java.util.Scanner;

public class addSum {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int value = 10;
        sum += value;
        sc(sum);

    }
    public static void sc(int sum){
        int value = scan.nextInt();
        sum += value;
        System.out.println(sum);

    }

}
