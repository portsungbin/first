package day02;

/*코드에서 프로그래머가 직접 입력한 값을 리터럴(Literal),
변수에 대입할 정수 리터럴을 진수에 따라 작성해본것이다
 */

public class IntegerLiteralEx {
    public static void main(String[] args) {
        //10진수 11을 이진수로 저장하려고 한다 어떻게 표현하면 될까?
        int x = 0b1011; //2진수
        System.out.println(x);

        //8진수는 0~7까지 1 0000000 에서 2진수로 바꾼후 오른쪽에서 부터 3개씩 묶음
        //00001011 이라면 00하나 001 하나 011 이렇게 묶음

        //10진수 11을 8진수로 저장하려고 한다 어떻게 표현하면 될까?
        int y = 013; //8진수
        System.out.println(y);

        //16진수는 00001011 오른쪽에서 부터 4개씩 묶고 10부터는 A로바뀜
        // 표현은 0x 로 시작하고 0~9까지는 숫자 그대로, 10~15는 A~F로 표현

        int z = 0xB; // 16진수
        System.out.println(z);



        int var1 = 0b1011;
        //11
        int var2 = 0206;
        //134 10000110
        int var3 = 365;
        //365
        int var4 = 0xB3; //10110011 179
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

    }
}
