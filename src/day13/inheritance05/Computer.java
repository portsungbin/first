package day13.inheritance05;

//계산기 기능 + 웹브라이징 + 영화보기 + 원의 면적 계산(확장)
public class Computer extends Calculator {

    private double radius;

    public Computer() {
    }
    public Computer(int garo, int sero) {
    }

    public Computer(double r) {
        this.radius = r;
    }

    //원의 면적 계산 기능 : areaCompute
    public void areaCompute() {
        System.out.println("원의 면적을 계산하는 기능을 수행합니다.");
        double result = Math.PI * this.radius * this.radius;
        System.out.printf("계산이 끝났습니다. 면적은 %.1f", result);
    }

    public static void main(String[] args) {
        //사각형의 면적을 구한다.
        //Computer c = new Computer();
        Calculator calculator = new Calculator(10, 20);
        //calculator.areaCompute();
        //원의 면적을 구한다
        Computer c = new Computer(5);
        //c.areaCompute();

        Calculator calculator1 = new Computer(10,20);
        calculator1.areaCompute();



    }

}
