package day10.Person;

public class PersonMain {
    public static void main(String[] args) {
//        Person 임성빈 = new Person();
//        //임성빈.name = "임성빈";
//        임성빈.setName("임성빈");
//        임성빈.age = 24;
//        임성빈.Phone = "010";

        Person 최문규 = new Person("최문규", 27, "0101234");

        System.out.println(최문규.getName() + 최문규.eat());

        //자신의 이름의 객체 생성, 생성자 오버로딩한 생성자 이용
        Person 임성빈 = new Person("임성빈", 25, "010");
        System.out.println(임성빈.getName() +" "+ 임성빈.play());
        System.out.println(임성빈.getName() +" "+ 임성빈.eat());
        System.out.println(임성빈.getName() +" "+ 임성빈.walk());
        System.out.println(임성빈.getAge()); //나이
        System.out.println(임성빈.getPhone()); //번호

    }
}
