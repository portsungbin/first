package day07;

public class StringEx2 {
    public static void main(String[] args) {
        int age = 40;
        String name = "신세계";
        System.out.println(name.hashCode());
        name = "신숙주";
        System.out.println(name.hashCode());

        String a = "Hello";
        a = "Hello" + " JAVA";
        System.out.println(a);

    }
}
