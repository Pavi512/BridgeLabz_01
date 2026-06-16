package oops;

class Example{
	int id;
	String name;
	public Example() {
		System.out.println("Default Constructor");
	}
	public Example(int id) {
		System.out.println("Constructor with ID");
//		this.id = id;
	}
	public Example(int id, String name) {
		System.out.println("Constructor with ID and Name");
//		this.id = id;
//		this.name = name;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example(1);
		Example e3 = new Example(1,"A");
	}

}
