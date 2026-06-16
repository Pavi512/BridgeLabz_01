package oops;

class Parent{
	public void sound() {
		System.out.println("Animal sound");
	}
}
class Child extends Parent{
	@Override
	public void sound() {
		System.out.println("Dog Bark");
	}
}
class Parent1{
	public static void sound() {
		System.out.println("Animal sound");
	}
}
class Child1 extends Parent1{
	public static void sound() {
		System.out.println("Dog Bark");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
//		Child c = new Child();
//		c.sound();
//		Parent p = new Parent();
//		p.sound();
		Parent p = new Child();
		p.sound();
		
//		Child1 c1 = new Child1();
//		Child1.sound(); //c1.sound();
//		Parent1 p1 = new Parent1();
//		Parent1.sound(); //p1.sound();
		Parent1 p1 = new Child1();
		p1.sound();
	}

}
