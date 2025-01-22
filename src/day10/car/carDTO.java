package day10.car;

import day10.DTO.CarDTO;

public class carDTO {
    private String model;
    private String name;
    private int speed = 0;

    public carDTO() {
    }

    public carDTO(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
