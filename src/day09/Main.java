package day09;

public class Main {

    public static void main(String[] args) {

        int[][] a = new int[5][5];

        System.out.println(1);
        a[0][0] = 1;
        for (int i = 1; i < a.length; i++) {
            System.out.print(1 + " ");
            a[i][0] = 1;
            for (int j = 1; j < i+1; j++) {
                if (j == i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                }
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }





    }
}
