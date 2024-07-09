package assignmentThree;
import java.util.Scanner;

class Employee{
	int EmpID;
	String EmpName;
	String Mailid;
	long MobileNo;
	float BP;
	
	Scanner sc = new Scanner(System.in);
	
	void displayEmployeeDetails(){
			System.out.println("Enter Employee ID : ");
			EmpID=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Name : ");
			EmpName=sc.nextLine();
			
			boolean validMailid=false;
				while(!validMailid) {
					System.out.println("Enter Employee Mail ID : ");
					Mailid=sc.nextLine();
					if(Mailid.contains("@")&& Mailid.contains(".")) 
					{
						validMailid=true;
					}
					else 
					{
						System.out.println("Invalid Credentials, Re-Enter Mail ID");
					}
				}
				boolean validMobileNo=false;
				while(!validMobileNo) {
					System.out.println("Enter Employee Mobile No : ");
					MobileNo=sc.nextLong();

				if(MobileNo>999999999) 
				{
					validMobileNo=true;
				}
				else 
				{
					System.out.println("Invalid Credentials, Re-Enter Mobile No");
					MobileNo=sc.nextLong();
				}
				}
	}

	void generatePaySlips()
	{
		float DA, HRA, PF, SCF, GrossSalary, NetSalary;
		
		DA = (float) (0.97 * BP);
        HRA = (float) (0.10 * BP);
        PF = (float) (0.12 * BP);
        SCF = (float) (0.001 * BP);
        GrossSalary = BP + DA + HRA;
        NetSalary = GrossSalary - PF - SCF;
        
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Employee ID : "+EmpID);
        System.out.println("Employee Name : "+EmpName);
        System.out.println("Employee Mail ID : "+Mailid);
        System.out.println("Employee Mobile Number : "+MobileNo);
        
        
        System.out.println("PAY SLIP");
        System.out.println("BASIC PAY: " + BP);
        System.out.println("GROSS SALARY: " + GrossSalary);
        System.out.println("NET SALARY: " + NetSalary);
        System.out.println("DEARNESS ALLOWANCE: " + DA);
        System.out.println("HOUSE RENT ALLOWANCE: " + HRA);
        System.out.println("PROVIDENT FUND: " + PF);
        System.out.println("SOCIAL CLUB FUND: " + SCF);
	}
}
class Programmer extends Employee{
	Scanner sc = new Scanner(System.in);
	public Programmer(){
		BP=50000;
	}
}

class TeamLead extends Employee{
	Scanner sc = new Scanner(System.in);
	public TeamLead(){
		BP=100000;
	}
}

class APM extends Employee{
	Scanner sc = new Scanner(System.in);
	public APM(){
		BP=250000;
	}
}

class PM extends Employee{
	Scanner sc = new Scanner(System.in);
	public PM(){
		BP=500000;
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("CHOOSE YOUR POSITION");
            System.out.println("1. Programmer \n2. Team Lead \n3. APM \n4. PM \n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                Programmer pgrm = new Programmer();
                pgrm.displayEmployeeDetails();
                pgrm.generatePaySlips();
                break;

            case 2:
                TeamLead tl = new TeamLead();
                tl.displayEmployeeDetails();
                tl.generatePaySlips();
                break;

            case 3:
                APM apm = new APM();
                apm.displayEmployeeDetails();
                apm.generatePaySlips();
                break;

            case 4:
                PM pm = new PM();
                pm.displayEmployeeDetails();
                pm.generatePaySlips();
                break;

            case 5:
                System.out.println("Program Exited");
                break;

            default:
                System.out.println("Invalid Input, Please Try Again");
            }
        }while (choice != 5);
        sc.close();
    }
}