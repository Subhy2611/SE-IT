package assignmentOne;
import java.util.Scanner;

public class ComplexNumber {
	float real;
	float img;
	
	public ComplexNumber(float r, float i) {
		this.real=r;
		this.img=i;
	}
	
	public void show() {
		System.out.println(this.real+" +i"+this.img);
	}
	
	public static ComplexNumber addition(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res=new ComplexNumber(0,0);
		res.real=n1.real+n2.real;
		res.img=n1.img+n2.img;
		return res;
	}
	
	public static ComplexNumber subtraction(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res=new ComplexNumber(0,0);
		res.real=n1.real-n2.real;
		res.img=n1.img-n2.img;
		return res;
	}
	
	public static ComplexNumber multiplication(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res=new ComplexNumber(0,0);
		res.real=n1.real*n2.real;
		res.img=n1.img*n2.img;
		return res;
	}
	
	public static ComplexNumber division(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res=new ComplexNumber(0,0);
		float numR=n1.real*n2.real+n1.img*n2.img;
		float numI=n1.img*n2.real-n1.real*n2.img;
		float den=n2.real*n2.real+n2.img*n2.img;
		float realn=numR/den;
		float imgn=numI/den;
		res.real=realn;
		res.img=imgn;
		return res;
	}

	public class begin {

		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				ComplexNumber c1 = new ComplexNumber(10,0);
				ComplexNumber c2 = new ComplexNumber(0,0);
				int input;
				boolean inp_taken = false;
				do {
					System.out.print("\nPress 1 to enter new pair of Complex Numbers ");
					System.out.print("\nPress 2 to get the subtraction of Complex Numbers ");
					System.out.print("\nPress 3 to get the addition of Complex Numbers ");
					System.out.print("\nPress 4 to get the multiplication of Complex Numbers ");
					System.out.print("\nPress 5 to get the division Complex Numbers ");
					System.out.print("\nPress 6 to EXIT ");
					
					input=sc.nextInt();
					switch(input) {
					case 1:
						inp_taken=true;
						System.out.print("\nEnter First Complex Number: ");
						int rr1,ii1;
						rr1=sc.nextInt();
						ii1=sc.nextInt();
						
						System.out.print("\nEnter Second Complex Number: ");
						int rr2,ii2;
						rr2=sc.nextInt();
						ii2=sc.nextInt();
						
						c1 = new ComplexNumber(rr1,ii1);
						c2 = new ComplexNumber(rr2,ii2);
						System.out.print("\nFirst Complex Number Entered: ");
						c1.show();
						
						System.out.print("\nSecond Complex Number Entered: ");
						c2.show();
					break;
					
					case 2:
						if(inp_taken==false) {
							System.out.print("\nPlease enter input: ");
							break;
						}
						ComplexNumber res1=ComplexNumber.addition(c1, c2);
						System.out.print("\n \nAddition : \n");
						res1.show();
					break;
					
					case 3:
						if(inp_taken==false) {
							System.out.print("\nPlease enter input: ");
							break;
						}
						ComplexNumber res2=ComplexNumber.subtraction(c1, c2);
						System.out.print("\n \nSubtraction : \n");
						res2.show();
					break;
					
					case 4:
						if(inp_taken==false) {
							System.out.print("\nPlease enter input: ");
							break;
						}
						ComplexNumber res3=ComplexNumber.multiplication(c1, c2);
						System.out.print("\n \nMultiplication : \n");
						res3.show();
					break;
					
					case 5:
						if(inp_taken==false) {
							System.out.print("\nPlease enter input: ");
							break;
						}
						if(c2.real==0 && c2.img==0) {
							System.out.print("\n!! Invalid Input, Kindly input numbers again!!\n");
							System.out.print("\nEnter Second Complex Number: ");
							int rre,iie;
							rre=sc.nextInt();
							iie=sc.nextInt();
							c2 = new ComplexNumber(rre,iie);
							
						}
						else
						{
						ComplexNumber res4=ComplexNumber.division(c1, c2);
						System.out.print("\n \nDivision : \n");
						res4.show();
						}
					break;
					
					case 6:
						
					break;
						}
					
				}while(input!=6);
			}

		}

	}
}