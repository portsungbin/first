package day04;

public class BitOperatorEx {
    public static void main(String[] args) {
        // 비트 연산하는방법
        // 앞의 값의 0의 비트는 출력되지 않음
        int n1 = 10;    //0000 1010
        int n2 = 11;    //0000 1011

        System.out.println("n1 : " + Integer.toBinaryString(n1));
        System.out.println("n2 : " + Integer.toBinaryString(n2));

        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 & n2));
        System.out.println("n1 | n2 : " + Integer.toBinaryString(n1 | n2));
        System.out.println("n1 ^ n2 : " + Integer.toBinaryString(n1 ^ n2));
        System.out.println("!n1 : " + Integer.toBinaryString(~n1));





    }
}
