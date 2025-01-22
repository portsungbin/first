package day07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[20];

        int i,j;
        int b = scan.nextInt();
        for (i = 0; i < b; i++) {
            a[i] = scan.nextInt();
        }


        for (i = 0; i < b - 1; i++) {
            for (j = i + 1; j < b; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }

        for (i = 0; i < b; i++) {
            System.out.println(a[i]);
        }




    }
}
