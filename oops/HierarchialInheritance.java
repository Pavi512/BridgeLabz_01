package oops;

class Animal03 {

    public void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog03 extends Animal03 {

    public void bark() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal03 {

    public void meow() {
        System.out.println("Cat Meowing");
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {

        Dog03 d = new Dog03();
        Cat c = new Cat();

        d.bark();
        c.meow();
    }
}
