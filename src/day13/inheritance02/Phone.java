package day13.inheritance02;

public class Phone {
    // 멤버 변수
    private String lastMessage;
    private String bander;
    private String model;
    private String color;

    public Phone(){};
    public Phone(String bander, String model, String color) {
        this.bander = bander;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getBander() {
        return bander;
    }

    public String getColor() {
        return color;
    }
}