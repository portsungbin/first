package day05;

public class SwitchEx {
    public static void main(String[] args) {
        char ch = 'A';

        switch (ch) {
            case 'A':
                   System.out.println("매우 우수");
                   break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("보통");
                break;
            default:
                System.out.println("잘못된 등급");

        }


    }
}
