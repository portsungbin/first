package day08.String;

public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        sb.append("Welcone");
        sb.append("Welcone");
        sb.append("Welcone");
        sb.append("Welcone");
        sb.append("Welcone");

        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb.capacity());

        sb1.append("11111111111111111111111111111");
        System.out.println(sb1.capacity());
        result = sb1.toString();
        System.out.println(result);

        String str = "abcdefg";
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println("처음 상태 : " + sb2);
        //StringBuffer -> String
        System.out.println(sb2.toString());
        System.out.println("문자열 추출 : " + sb2.substring(2, 4));
        System.out.println("문자열 추가 : " + sb2.insert(7, "hij"));
        System.out.println("문자열 삭제 : " + sb2.delete(3, 6));
        System.out.println("문자열 추가하기 : " + sb2.append("하하하하~"));
        System.out.println("문자열 길이 : " + sb2.length());
        System.out.println("문자열 거꾸로 출력 : " + sb2.reverse());
        System.out.println(sb2.toString());

        String star = "*";

        for (int i = 1; i < 10; i++) {
            star += "*";
        }
        System.out.println(star);

        StringBuffer sb3 = new StringBuffer("*");
        sb3.append("*********");
        System.out.println(sb3.toString());

        String str3 = "hello" + "world";
        String str4 = new StringBuffer("hello").append("world").toString();
        System.out.println(str4);


        StringBuilder sb4 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb4.append(i);
        }
        final String number = sb4.toString();
        System.out.println(number);
        //문자열 연산이 많을 경우 StringBuilder 객체로 문자열을 생성해서 다루는 것이 성능을 고려하는데 좋다






    }
}
