package oops;

interface A{
	void displayA();
}
interface B{
	void displayB();
}
class C implements A,B{

	@Override
	public void displayA() {
		System.out.println("Method A");
	}
	@Override
	public void displayB() {
		System.out.println("Method B");
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		C c = new C();
		c.displayA();
		c.displayB();
		
//		A a = new C();
//		a.displayA();
////		a.display();
//		((B) a).displayB(); 
		
//		B b = new C();
//		b.displayB();
////		b.displayA();
//		((A) b).displayA();
	}

}
