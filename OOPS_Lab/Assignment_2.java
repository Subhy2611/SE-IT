package mock;
import java.util.Scanner;

class Publication {
    String Title;
    float Price;
    int Copies;

    void saleCopy() {
        System.out.println("Total Sale : " + Price * Copies);
    }
}

class Book {
    String Title;
    String Author;
    float Price;
    int Copies;

    Scanner sc = new Scanner(System.in);

    void displayBookDetails() {
        System.out.println("Enter Book Title: ");
        Title = sc.nextLine();
        System.out.println("Enter Book Author: ");
        Author = sc.nextLine();
        System.out.println("Enter Book Price: ");
        Price = sc.nextFloat();

        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Price: " + Price);
    }

    void saleCopy() {
        System.out.println("Total Sale: " + Price * Copies);
    }

    void orderCopies() {
        System.out.println("Number of copies to order: ");
        Copies = sc.nextInt();
    }
}

class Magazine {
    String Title;
    float Price;
    int Copies;
    
    Scanner sc = new Scanner(System.in);
    
    void displayMagazineDetails() {
    	System.out.println("Enter Magazine Title: ");
        Title = sc.nextLine();
    	System.out.println("Enter Magazine Price: ");
        Price = sc.nextFloat();
        
        System.out.println("Title of Magazine: " + Title);
        System.out.println("Price of Magazine: " + Price);
    }
    
    void orderQty() {
        System.out.println("Enter the number of magazine copies to order: ");
        Copies = sc.nextInt();
    }

    void saleCopy() {
        System.out.println("Total Sale: " + Price * Copies);
    }

    void currentIssue() {
        System.out.println("Displaying current issue information...");
    }

    void receiveIssue() {
        System.out.println("Receiving the magazine issue...");
    }
}

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        float totalSale=0;

        do {
            System.out.println("1. Publication");
            System.out.println("2. Book");
            System.out.println("3. Magazine");
            System.out.println("4. Exit");
            choice = sc.nextInt();
			switch (choice) {
                case 1: {
                    Publication publication = new Publication();
                    publication.saleCopy();
                    totalSale = totalSale1 + totalSale2;
                    break;
                }
                case 2: {
                    Book book = new Book();
                    book.displayBookDetails();
                    book.orderCopies();
                    book.saleCopy();
                    totalSale1 += book.Price * book.Copies;
                    break;
                }
                case 3: {
                    Magazine magazine = new Magazine();
                    magazine.displayMagazineDetails();
                    magazine.orderQty();
                    magazine.saleCopy();
                    totalSale2 += magazine.Price * magazine.Copies;
                    magazine.currentIssue();
                    magazine.receiveIssue();
                    break;
                }
                case 4: {
                    System.out.println("Program Exited");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please Try Again");
                }
            }
        } while (choice != 4);

        System.out.println("Total Sale of Publications: " + totalSale);
        sc.close();
    }
}
