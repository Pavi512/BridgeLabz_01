package oops;


class Animal02 {

    public void eat() {
        System.out.println("Eating");
    }
}

class Dog02 extends Animal02 {

    public void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog02 {

    public void play() {
        System.out.println("Playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}

