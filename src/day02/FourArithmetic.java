package day02;

public class FourArithmetic {
    public static void main(String[] args) {
        add(12, 2);
        Qorl(12, 2);
        rhqgkrl(12, 2);
        sksnrl(12, 2);

    }

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("a+b=" + sum);
    }

    public static void Qorl(int a, int b) {
        int sum = a - b;
        System.out.println("a-b=" + sum);
    }

    public static void rhqgkrl(int a, int b) {
        int sum = a * b;
        System.out.println("a*b=" + sum);
    }

    public static void sksnrl(int a, int b) {
        int sum = a / b;
        System.out.println("a/b=" + sum);
    }
}
