package oops;

import java.util.Scanner;

class Student{
	int id; 
	String name;
	int marks;
	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
	}
}

public class StudentClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		s.id = scan.nextInt();
		scan.nextLine();
		s.name = scan.nextLine();
		s.marks = scan.nextInt();
		s.display();
	}

}
