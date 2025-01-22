package day02;

public class Operator {
    public static void main(String[] args) {
        kor(77, 87);
        eng(77, 87);

    }

    public static void kor(int a, int b) {
        int sum = a + b;
        System.out.println("총점:" + sum);
    }
    public static void eng(int a, int b) {
        int sum = (a + b) / 2;
        System.out.println("평균:" + sum);
    }
}
