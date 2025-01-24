package day13.inheritance05;

//산술연산계산기
public class Calculator {

    private int garo;
    private int sero;

    public Calculator() {
    }

    public Calculator(int garo, int sero) {
        this.garo = garo;
        this.sero = sero;
    }

    public void areaCompute() {
        System.out.println("사각형 면적을 계산하는 기능을 수행합니다.");
        int result = this.garo * this.sero;
        System.out.println("계산이 끝났습니다. 면적은 " +result);
    }




}
