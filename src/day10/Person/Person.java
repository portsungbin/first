package day10.Person;

public class Person {


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;
    private String Phone;
    //생성자 오버로딩 한 경우 컴파일러는 자동으로 기본생성자를 생성해 주지 않으므로, 필요시 개발자가 기본 생성자를 직접 기술해 주어야 한다.
    public Person() { //default constructor 기본생성자 : 만약 개발자가 기술해 놓지 않으면 컴파일러가 생성해
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.Phone = phone;     //생성자 오버로딩
    }

    public Person(String name, String phone) {
        this.name = name;
        this.Phone = phone;
    }



    public String play() {
        return "운동을 한다.";
    }

    public String eat() {
        return "점심시간에 우동을 먹다.";
    }

    public String walk() {
        return "점심시간에 걷다.";
    }

}
