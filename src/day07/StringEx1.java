package day07;

public class StringEx1 {
    public static void main(String[] args) {

//        String subject = "Java Programming";
//        int length = subject.length();
//
//        //문제열 대체하기 : 문자열에서 특정 문자열을 다른 문자열을 대체할때 replace();
//        String oldStr = "자바 프로그래밍";
//        String newStr = "혼자 공부하는 자바 프로그래밍";
//        String printStr1 = oldStr.replace("자바", "JAVA");
//        String printStr2 = newStr.replace("혼자 공부하는", "다 함께 공부하는");
//        System.out.println(printStr1 + " " + printStr2);

        //문자열 분리
        String board = "1,제목,내용,작성자,파일";
        String[] tokens = board.split(",");
        System.out.println(tokens[0]);
        System.out.println(tokens[1]);
        System.out.println(tokens[2]);
        System.out.println(tokens[3]);
        System.out.println(tokens[4]);
        System.out.println();
        System.out.println("=====================");

        for (String data : tokens) {
            System.out.println(data);
        }
        System.out.println();
        System.out.println("=========================");
        for(int index = 0  ; index < tokens.length; index++){
            System.out.println(tokens[index]);
        }




    }
}
