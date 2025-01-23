package day12;

public class ArrayCopyByForEx {
    public static void main(String[] args) {
        int[] newIntArray = new int[5];
        int[] oldIntArray = {1,2,3};
        int[] oldIntArray2 = new int[5];

        newIntArray[0] = oldIntArray[0];
        newIntArray[1] = oldIntArray[1];
        newIntArray[2] = oldIntArray[2];

        // 1. for문을 배열의 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        //2.자바 API System클래스에서 제공하는 arraycopy()를 이용한 방법
        System.arraycopy(oldIntArray,0,oldIntArray2,0,oldIntArray.length);

        //길이가 5인 배열에 옮긴 항목들이 잘 옮겨 졌는지 항목을 확인
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + " ");
        }
        System.out.println();
        for (int i : oldIntArray2) {
            System.out.print(i + " ");
        }


        //배열의 개수와 지정위치를 정한 후 다른 배열에 복사 후 for문을 이용해 순서대로 저장 그리고 다른 for문을 사용해 출력


    }
}
