package day12;

class GrandFather{
    void printGrandFather() {
        System.out.println("나는 할아버지입니다.");
    }
}

class SubFather extends GrandFather{
    void fmailyName() {
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }

    void houseAddress() {
        System.out.println("나의 집은 인천");
    }
    void printFather() {
        System.out.println("나의 아버지는 프로그래머");
    }

}

class SubSon extends SubFather{
    void printSon() {
        System.out.println("나는 아들입니다\n나는 아버지로부터 상속받습니다.");
    }
}

public class objSon {
    public static void main(String[] args) {
        SubSon sb = new SubSon();
        sb.printSon();
        sb.printFather();
        sb.houseAddress();
        sb.fmailyName();
        sb.printGrandFather();
    }
}
