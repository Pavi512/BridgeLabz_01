package oops;

class Animals {

    public void eat() {
        System.out.println("Animal Eating");
    }
}

class Dogs extends Animals {

    public void bark() {
        System.out.println("Dog Barking");
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Dogs d = new Dogs();

        d.eat();
        d.bark();
    }
}

