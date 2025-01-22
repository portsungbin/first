package day04;

public class InfinityAndNANCheckEx {
    public static void main(String[] args) {
        
        int x = 5;  //Infinity
        double y = 0.0; //NaN : Not a Number
        double z = x % y;
        //Infinity 와 NaN 의 의미는 무한대의 값을 정수로 표현할 수 없다
        

        System.out.println(z + 2);

        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        } 
        
        
        
    }
}
