package day10.car;

public class carDAO {
    public carDTO carDTO;

    public carDAO(carDTO carDTO) {
        this.carDTO = carDTO;
    }


    public void speedUp() {
        carDTO.setSpeed(carDTO.getSpeed()+1);
        System.out.println("속도 : " + carDTO.getSpeed());
    }

    public void speedDown() {
        if (carDTO.getSpeed() > 0) {
            carDTO.setSpeed(carDTO.getSpeed() - 1);
            System.out.println("속도 : " + carDTO.getSpeed());
        } else {
            System.out.println("0입니다.");
        }

    }


}
