package day04;

public class AssignmentOperatorEx {
    public static void main(String[] args) {
        int result = 10;

        result += 10;
        result -= 10;
        result *= 10;
        result /= 10;
        result %= 10;

        //삼항(조건) 연산자 : (변수 비교연산자 변수) ? 값1 : 값2;

        int score = 90;

        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade);




    }
}
