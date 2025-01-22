package day04;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        // 논리연산자 (&&논리곱, || 논리합, ^ 배타적논리합, ! Not)

        int charCode = 'A'; //65~90 알파벳 대문자 범위 A~Z
        //charCode 변수에 들어간 값이 대문자인지 소문자인지 검증하고 싶다
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("알파벳 대문자 이군요");
        } else if (97 <= charCode && charCode <= 122) {// 97~122 알파벳 소문자 범위 a~z
            System.out.println("알파벳 소문자 이군요");
        } else if (48 <= charCode && charCode <= 57) {
            System.out.println("0~9사의 숫자값이군요"); // char 48~57은 숫자 0~9 범위 숫자
        }

        int value = 6;
        //value 변수의 값이 짝수인지 홀수 인지 판별하는 구문을 작성하세요
        if (value % 2 == 0 || value % 3 == 0) {
            System.out.println("2또는 3의 배수이군요");
        } else {
            System.out.println("2또는 3의 배수가 아니군요");
        }



    }
}
