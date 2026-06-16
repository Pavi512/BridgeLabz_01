package oops;

interface Animal{
	void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog Barking");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
		Animal a = new Dog();
		a.sound();
	}

}
