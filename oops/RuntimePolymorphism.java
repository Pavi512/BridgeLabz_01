package oops;

class Animal04 {

    public void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog04 extends Animal04 {

    @Override
    public void sound() {
        System.out.println("Dog Bark");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        Animal04 a = new Dog04();

        a.sound();
    }
}
