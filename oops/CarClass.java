package oops;

import java.util.Scanner;

class Car {

    String brand;
    String model;
    long price;

    Car(String brand, String model, long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display() {
        System.out.println(brand + " " + model + " " + price);
    }
}

public class CarClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Brand : ");
        String brand = sc.nextLine();

        System.out.print("Model : ");
        String model = sc.nextLine();

        System.out.print("Price : ");
        long price = sc.nextLong();

        Car car = new Car(brand, model, price);

        car.display();

        sc.close();
    }
}



