package day07;

class Phone {

}

public class RefVarEx {
    public static void main(String[] args) {

//        int[] arr1;
//        int[] arr2;
//        int[] arr3;
//
//        arr1 = new int[]{1,2,3};
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr1[2]);
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]);
//        }
//
//        for (int i : arr1) {
//            System.out.print(i);
//        }

        //자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)라고 한다.
        //참조 변수에 null 상태에서 객체의 데이터나 메소드를 사용하려면 예외가 발생한다.
        int[] intArray = new int[]{0,0,0,0}; //null
        intArray[0] = 10;
        for (int i : intArray) {

        }

    }
}
