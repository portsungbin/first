package day10.car;

public class Cmain {
    public static void main(String[] args) {

        carDTO car1 = new carDTO();
        carDAO car2 = new carDAO(car1);
        car2.speedUp();
        car2.speedDown();
        car2.speedDown();

    }
}
