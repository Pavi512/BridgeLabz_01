package oops;

class Calculate{
	public void area(double radius) {
		double circle_area = Math.PI * radius * radius;
		System.out.printf("Circle Radius = %.2f" , circle_area);
		System.out.println();
	}
	public void area(int l, int b) {
		System.out.println("Rectangle area = " + l*b);
	}
}

public class OverloadingArea {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.area(5);
		cal.area(10, 5);
	}

}
