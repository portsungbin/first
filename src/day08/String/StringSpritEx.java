package day08.String;

//split = 잘라내기
public class StringSpritEx {
    public static void main(String[] args) {
        String str = "input@github.com@thatzcool#aaaa@bbb";
        String[] splitter = str.split("[%-@#]");

        System.out.println(splitter[0]);
        System.out.println(splitter[1]);
        System.out.println(splitter[2]);
        System.out.println(splitter[3]);
        System.out.println(splitter[4]);
        System.out.println(splitter[5]);

//        int i = 0;
//        for (String a : splitter) {
//            System.out.printf("%d 위치 : %s%n", ++i, a);
//        }
//
//        for (int in = 0; in < splitter.length; in++) {
//            System.out.println(splitter[in]);
//        }


    }
}
