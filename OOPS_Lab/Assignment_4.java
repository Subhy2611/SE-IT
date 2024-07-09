package assignmentFour;
import java.util.Scanner;

abstract class Shape{
	double val1;
	double val2;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value 1 : ");
		val1 = sc.nextDouble();
		
		System.out.println("Enter Value 2 : ");
		val2 = sc.nextDouble();
	}
	abstract void computeArea();
}

class triangle extends Shape{
	void computeArea() {
		double area;
		area=0.5*(val1*val2);
		System.out.println("Area of triangle, base = " + val1+" and height = " + val2 + " is : " + area);
	}
}

class rectangle extends Shape{
	void computeArea() {
		double area;
		area=val1*val2;
		System.out.println("Area of rectangle, length = " + val1+" and breadth = " + val2 + " is : " + area);
	}
}

class rhombus extends Shape{
	void computeArea() {
		double area;
		area=val1*val2/2;
		System.out.println("Area of rectangle, diagonal a = " + val1+" and diagonal b = " + val2 + " is : " + area);
	}
}

public class Shapes {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Choose the shape for which you want to calculate area : ");
			System.out.println("1. Triangle");
			System.out.println("2. Rectangle");
			System.out.println("3. Rhombus");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Accepting values (Value-1=base, Value-2=height)for triangle.");
				Shape t=new triangle();
				t.input();
				t.computeArea();
				break;
				
			case 2:
				System.out.println("Accepting values (Value-1=length, Value-2=breadth)for rectangle.");
				Shape r=new rectangle();
				r.input();
				r.computeArea();
				break;
				
			case 3:
				System.out.println("Accepting values (Value-1=diagonal a, Value-2=diagonal b)for rhombus.");
				Shape rh=new rhombus();
				rh.input();
				rh.computeArea();
				break;
				
			case 4:
				System.out.println("Program Exited");
			}
		}while(choice!=4);
		sc.close();
	}

}
