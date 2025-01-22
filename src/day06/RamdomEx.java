package day06;

//Random (난수) : 컴퓨터가 무작위로 발생시킨 수
//자바 : 1. Random클래스 2. Math.random() 2가지 방법으로 난수를 발생하여 활용

import java.util.Random;
public class RamdomEx {
    public static void main(String[] args) {

        Random random = new Random(); //Random 클래스를 실체화(instance : 메모리 생성) 하였다
        //0~3까지의 범위의 난수 생성
        int n1 = random.nextInt(4);
        for (int i = 1; i <= 2; i++) {
            int n2 = random.nextInt(4)+1;
            int n3 = random.nextInt(6)+100;
            for (int j = 1; j <= 3; j++) {
                System.out.print(n2+" ");
                System.out.println(n3);
            }

        }

        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();
        System.out.println(l + ", " + f + ", " + d + ", " + b);

        //0~10 사이의 값
        int num1 = (int) (Math.random() * 10);
        //0~100 사이의 값
        int num2 = (int) (Math.random() * 100);
        //1~ 10 사이의 값
        int num3 = (int) (Math.random() * 10+1);
        //10~ 20 사이의 값
        int num4 = (int) (Math.random() * 10+10);

        //1~ 45 사이의 값
        int num5 = (int) (Math.random() * 45+1); //0~44 (+1)
        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

        //60 ~ -45 난수 생성하는 식
//        int num6 = random.nextInt(max - min + 1);
        int max = 60;
        int min = -45;
        int num6 = random.nextInt(max-min+1)+min;
        System.out.println(num6);

    }
}
