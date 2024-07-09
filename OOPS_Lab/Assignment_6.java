package assignmentSix;
import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionClass
{
	public void arrayIndexOutOfBounds() {
		Scanner sc=new Scanner(System.in);
		try
		{
			int index;
			int[] arr= {10,20,30,40,50,60};
			System.out.println("Enter the index of the element that you want to display : ");
			index=sc.nextInt();
	
			System.out.println("The number for index number "+index+" is : "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The element from the index you entered cannot be accessed. Enter a valid index for the element");
		}
	}
	
}

class NumberFormatAndArithmeticExceptionClass
{
	Scanner sc=new Scanner(System.in);
	public void NumberFormatAndArithmeticException() {
		try
		{
			System.out.println("Enter first number : ");
			double num1=sc.nextDouble();
			
			System.out.println("Enter second number : ");
			double num2=sc.nextDouble();
			
			double result=num1/num2;
			System.out.println("The remainder upon division is : "+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e+"Cannot divide the numbers by zero");	
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println(e+"Enter the number in the correct format");
		}
		
	}
}

public class Excptn {
	public static void main(String[]args)
	{
		System.out.println("Which exception you need to check?");
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("1. Array Out Of Bounds Exception");
			System.out.println("2. Arithmetic Exception and  Number Format Exception");
			System.out.println("3.Exit");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				ArrayIndexOutOfBoundsExceptionClass obj1=new ArrayIndexOutOfBoundsExceptionClass();
				obj1.arrayIndexOutOfBounds();
				break;
				
			case 2:
				NumberFormatAndArithmeticExceptionClass obj2=new NumberFormatAndArithmeticExceptionClass();
				obj2.NumberFormatAndArithmeticException();
				break;
				
			case 3:
				System.out.println("Successfully Exitted");
				break;
				
			default:
				System.out.println("Invalid Input, Try Again");
			}
		}while(choice!=3);
	}
}
