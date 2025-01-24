package day13.inheritance01;

class Animal{
    public void eat() {
        System.out.println("먹이를 먹다.");
    }
}

class cat extends Animal{
    public void meam() {
        System.out.println("야옹하고 울다.");
    }
}

class dog extends Animal {
    public void dogs() {
        System.out.println("멍멍하고 짖다.");
    }
}


public class AnimalMain {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
        c.meam();
        c.eat();
        d.dogs();
        d.eat();
    }
}
