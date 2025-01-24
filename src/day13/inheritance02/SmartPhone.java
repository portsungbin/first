package day13.inheritance02;

public class SmartPhone extends Phone {


    public SmartPhone(String model, String color) {
        super();

        System.out.println("SmartPhone 모델과 컬러" + super.getBander() + super.getModel() + super.getColor());
    }

}
