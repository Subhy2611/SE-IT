package assignmentNineA;
import java.util.*;
public class Product {
Scanner sc=new Scanner(System.in);
String prName;
int costPrice,sellPrice,avStock;
static int totalSold=0;
void create() {
	System.out.println("Enter Product Name : ");
	prName=sc.next();
	System.out.println("Enter Cost Price : ");
	costPrice=sc.nextInt();
	System.out.println("Enter Sell Price : ");
	sellPrice=sc.nextInt();
	System.out.println("Enter Available Stock : ");
	avStock=sc.nextInt();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,op1,op2,size,x;
		Product p=new Product();
		ArrayList<Product> arr=new ArrayList<Product>();
		ArrayList<Integer>pur=new ArrayList<Integer>();
		do {
			System.out.println("1.SELLER :");
			System.out.println("2.COSTUMER :");
			System.out.println("3.Exit :");
			System.out.print("enter your choice : ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					do {
						System.out.println("1.ADD PRODUCTS");
						System.out.println("2.BALANCE STOCK");
						System.out.println("3.CHECK PROFIT OR LOSS");
						System.out.println("4.Exit");
						System.out.print("enter your choice : ");
						op1=sc.nextInt();
						switch(op1) {
						
						case 1:
						    System.out.println("Enter the number of products in the list :");
						    size = sc.nextInt();
						    for (int i = 0; i < size; i++) {
						        Product newProduct = new Product();  
						        System.out.println("Enter details of product :" + (i + 1));
						        newProduct.create();
						        arr.add(newProduct);
						        System.out.println("");
						    }
						    break;

				
						case 2:
						    System.out.println("*********BALANCE STOCK SHEET***********");
						    for (int i = 0; i < arr.size(); i++) {
						        Product product = arr.get(i);
						        System.out.println("Product: " + (i + 1) + ", product name: " + product.prName + ", its available stock: " + product.avStock);
						    }
						    System.out.println("");
						    break;

						
						case 3:
						    System.out.println("*******PROFIT/LOSS SHEET FOR PRODUCTS***********");
						    for (int i = 0; i < arr.size(); i++) {
						        Product product = arr.get(i);
						        int loss = 100 * (product.costPrice - product.sellPrice) / product.costPrice;
						        int profit =  100 * (product.sellPrice - product.costPrice) / product.sellPrice;
						        System.out.println("for product number : " + (i + 1) + " product name :" + product.prName);
						        if (product.costPrice > product.sellPrice) {
						            System.out.println("LOSS case :");
						            System.out.println("LOSS PERCENTAGE is : " + loss);
						        } else if (product.costPrice < product.sellPrice) {
						            System.out.println("PROFIT case :");
						            System.out.println("PROFIT PERCENTAGE is : " + profit);
						        } else if (product.costPrice == product.sellPrice) {
						            System.out.println("No profit or loss : ");
						        }
						    }
						    System.out.println("");
						    break;

							case 4:
								System.out.println("Exit code!!!");
								break;
							default:
								System.out.println("Enter valid choice : ");
								break;
						}
					}while(op1!=4);
				case 2 :
					do {
						System.out.println("**************CUSTOMER MENU*************");
						System.out.println("1.LIST OF PRODUCTS");
						System.out.println("2.PURCHASE");
						System.out.println("3.BILL");
						System.out.print("Enter your choice : ");
						op2=sc.nextInt();
						switch(op2) {
						case 1:
							System.out.println("******LIST OF PRODUCTS*******");
							for(int i=0;i<arr.size();i++) {
								Product pr=arr.get(i);
								System.out.println("product: "+(i+1)+", product name: "+pr.prName+", product cost: "+pr.sellPrice);
							}
							System.out.println("");
							break;
						case 2:
							System.out.println("Enter the number of items to be purchased: ");
							x=sc.nextInt();
							for(int i=0;i<x;i++) {
								System.out.println("product: "+(i+1)+" to be purchased is PRODUCT NUMBER " );
								pur.add(sc.nextInt());
							}
							System.out.println("List of purchased items : ");
							for(int i=0;i<x;i++) {
								Product m=arr.get(pur.get(i)-1);
								System.out.println("Product: "+(i+1)+", product name: "+m.prName);
							}
							System.out.println("");
							break;
							
						case 3:
							System.out.println("*********BILL*********");
							for(int i=0;i<pur.size();i++) {
								Product m=arr.get(pur.get(i)-1);
								System.out.println("product: "+(i+1)+", product name: "+m.prName+", product cost: "+m.sellPrice);
								totalSold+=m.sellPrice;
							}
							System.out.println("the TOTAL AMOUNT TO BE PAID: "+totalSold);
							System.out.println("");
							break;
						case 4:
							System.out.println("exit code");
						default:
							System.out.println("enter valid choice");
						}
					}while(op2!=4);
			}
		}while(ch!=3);
		sc.close();
	}
}


/*********************************************************************************************************** */


package assignmentNineB;
import java.io.*;
import java.util.*;


class ExceptionHandling{
	Scanner sc = new Scanner(System.in);
	
	int takeInput() {
		int ans = 0;
		while(true) {
			try {
				ans = Integer.parseInt(sc.next());
				break;
			}
			catch(NumberFormatException e) {
				System.out.println(e);
				System.out.println("Invalid Input!!\nEnter valid  input : ");
			}
		}
		return ans;
	}
}


class Products{
	String productName;
	double costPrice, sellPrice;
	int StockAvailable, TotalSold;
	
	Products(String productName, double costPrice, double sellPrice, int StockAvailable){
		this.productName = productName;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.StockAvailable = StockAvailable;
	}
}
public class Inventory {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op = 1, op1 = 1, op2 = 1;
		String pName;
		double costPrice, sellPrice, sp = 0, cp = 0;
		int n = 0;
		
		ExceptionHandling eh = new ExceptionHandling();
		ArrayList<Products>arr = new ArrayList<>();
		
		while(op!=0) {
			System.out.println("\nINVENTORY MANAGEMENT SYSTEM");
			System.out.println("1. For Seller");
			System.out.println("2. For Customer");
			System.out.println("*. Press any other key to exit");
			
			op = eh.takeInput();
			
			switch(op) {
			case 1:
				op1 = 1;
				while(op1!=0) {
					System.out.println("\nSELLER");
					System.out.println("1. Add Product");
					System.out.println("2. Balance Stock");
					System.out.println("3. Loss and Profit Calculation");
					System.out.println("*. Press any other key to go to the main menu");
					
					op1 = eh.takeInput();
					
					switch(op1) {
					case 1:
						pName = "";
						System.out.println("Enter Product Name : ");
						while(pName.isEmpty()) {
							pName = sc.nextLine();
						}
						System.out.println("Enter the cost price : ");
						costPrice = sc.nextDouble();
						System.out.println("Enter the selling price : ");
						sellPrice = sc.nextDouble();
						System.out.println("Enter the number of items you want to add : ");
						n = eh.takeInput();
						
						Products p = new Products(pName, costPrice, sellPrice, n); 
						arr.add(p);
						break;
					case 2:
						System.out.println("Product\tStock\n");
						for(Products it : arr) {
							System.out.println(it.productName + "\t" + it.StockAvailable);
						}
						break;
					case 3:
						if (sp == cp) {
							System.out.println("No Profit or Loss");
						}
						else if (sp < cp) {
							System.out.println("Loss : " + (cp-sp));
							System.out.println("Loss% : " + 100*(cp-sp)/cp);
						}
						else {
							System.out.println("Profit : " + (sp-cp));
							System.out.println("Profit% : " + 100*(sp-cp)/cp);
						}
						break;
					default:
						op1 = 0;
						break;
					}
				}
				break;
			case 2:
				op2 = 1;
				while(op2!=0) {
					System.out.println("\nCUSTOMER");
					System.out.println("1. List of all Products");
					System.out.println("2. Display Individual Product Information");
					System.out.println("3. Purchase");
					System.out.println("*. Press any other key to go to the main menu");
					
					op2 = eh.takeInput();
					
					switch(op2) {
					case 1:
						int ind = 1;
						System.out.println("S.No\tProduct\tPrice\n");
						for(Products it : arr) {
							System.out.println(ind + ".\t" + it.productName + "\t" + it.costPrice);
							ind++;
						}
						break;
						
					case 2:
						System.out.println("Enter the serial number of the product you want to see : ");
						n = eh.takeInput();
						
						Products p = null;
						
						try {
							p = arr.get(n-1);
						}
						catch(Exception e) {
							System.out.println("Invalid Index!!\n");
							break;
						}
						
						System.out.println("Product Name : " + p.productName + "\nSelling Price : " + p.sellPrice + "\nStock Available : " + p.StockAvailable);
						break;
						
					case 3:
						System.out.println("Enter the serial number of the product you want to purchase : ");
						n = eh.takeInput();
						
						Products q = null;
						try {
							q = arr.get(n-1);
						}
						catch(Exception e) {
							System.out.println("Invalid Index!!\n");
							break;
						}
						
						System.out.println("Product Name : " + q.productName + "\nSell Price : " + q.sellPrice);
						
						System.out.println("Enter the number of items you want to purchase : ");
						n = eh.takeInput();
					
						if (n > q.StockAvailable) {
							System.out.println("Only " + q.StockAvailable + " items left!!");
						}
						else {
							sp += n*q.sellPrice;
							cp += n*q.costPrice;
							System.out.println("Order placed successfully!!\n BILL : Rs " + n*q.sellPrice + "\nReceipt Generated : Bill.txt");
							q.StockAvailable-=n;
							
							String file = "Bill.txt";
							String s = "Item Name : " + q.productName + "  Quantity : " + n + "  Cost of 1 item : " + q.sellPrice + "  Total Cost : " + n*q.sellPrice; 
							try {
								FileWriter writer = new FileWriter(file);
								writer.write(s + "\n");
								writer.close();
							} catch (IOException e) {
								System.out.println(e);
							}
						}
						break;

					default:
						op2 = 0;
						break;
					}
				}
				break;
			default:
				op = 0;
				break;
			}
		}
	}
}


/*********************************************************************************************************** */


package assignmentNineC;
import java.util.*;
public class Tourist {
Scanner sc=new Scanner(System.in);
String name,source,destination;
int days,pp;
int totalPrice=days*pp;
void create() {
	System.out.println("Enter Person Name : ");
	name=sc.next();
	System.out.println("Enter Source Place : ");
	source=sc.next();
	System.out.println("Enter Destination Place : ");
	destination=sc.next();
	System.out.println("Enter Price Per Day : ");
	pp=sc.nextInt();
	System.out.println("Enter Number of Days : ");
	days=sc.nextInt();
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Tourist>t=new ArrayList<Tourist>();
		ArrayList<Integer>ar=new ArrayList<Integer>();
		ArrayList<Integer>dt=new ArrayList<Integer>();
		int ch,size,s,d;
		do {
			System.out.println("*****************MENU***************");
			System.out.println("1.ENTER TOURIST DETAILS");
			System.out.println("2.UPDATE TOURIST DETAILS");
			System.out.println("3.DELETE TOURIST DETAILS");
			System.out.println("4.DISPLAY TOURIST DETAILS");
			System.out.println("5.Exit");
			System.out.print("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter the total number of tourist :");
					size=sc.nextInt();
					for(int i=0;i<size;i++) {
						Tourist tr=new Tourist();
						System.out.println("details of TOURIST "+(i+1));
						tr.create();
						t.add(tr);
					}
					System.out.println("");
					break;
				case 2:
					System.out.println("enter the TOTAL NUMBER of tourist details you want to UPDATE");
					s=sc.nextInt();
					System.out.println("enter TOURIST NUMBER you want to update :");
					for(int i=0;i<s;i++) {
						System.out.println((i+1)+" TOURIST NUMBER : ");
						ar.add(sc.nextInt());
					}
					for(int i=0;i<ar.size();i++) {
						Tourist tr=t.get(ar.get(i)-1);
						System.out.println("enter new details");
						tr.create();
						t.set(ar.get(i)-1,tr);
					}
					System.out.println("");
					break;
				case 3:
					System.out.println("enter the TOTAL NUMBER of tourist details you want to DELETE");
					d=sc.nextInt();
					System.out.println("enter TOURIST NUMBER you want to delete :");
					for(int i=0;i<d;i++) {
						System.out.println((i+1)+" TOURIST NUMBER : ");
						dt.add(sc.nextInt());
					}
					for(int i=0;i<d;i++) {
						Tourist tr=t.get(dt.get(i)-1);
						t.remove(tr);
					}
					System.out.println("");
					break;
				case 4:
					System.out.println("*****LIST OF TOURIST*****");
					for(int i=0;i<t.size();i++) {
						Tourist tr=t.get(i);
						System.out.println("TOURIST NUMBER : "+(i+1)+", NAME: "+tr.name+", SOURCE : "+tr.source+", DESTINATION: "+tr.destination+", DAYS: "+tr.days+", TOTAL PRICE"+tr.days*tr.pp);
					}
					System.out.println("");
					break;
				case 5:
					System.out.println("Exit Code");
					break;
				default:
					System.out.println("Please enter valid input: ");
					break;		
			}
		}while(ch!=5);
		sc.close();
	}
}



