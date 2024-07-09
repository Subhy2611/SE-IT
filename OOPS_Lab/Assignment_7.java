package assignmentSeven;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Assignment_7 {
    static int count = 0;

    static void check(int ch, int num) {
        switch (ch) {
            case 1:
                evenOdd(num);
                break;

            case 2:
                primeNumber(num);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
            count += 1;
        } else {
            System.out.println(num + " is odd number");
        }
    }

    static void primeNumber(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number.");
            count += 1;
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    static void palindrome(String str1) {
        StringBuilder s1 = new StringBuilder(str1);
        if (str1.equals(s1.reverse().toString())) {
            System.out.println(str1 + " is palindrome");
            count += 1;
        } else {
            System.out.println(str1 + " is not palindrome");
        }
    }

    static void integerOp() {
        int element, n, ch;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            element = sc.nextInt();
            nums.add(element);
        }

        System.out.println("1.Even or Odd");
        System.out.println("2.Prime or not");
        System.out.println("Choose:");

        ch = sc.nextInt();
        Iterator<Integer> itr = nums.iterator();
        count = 0;
        while (itr.hasNext()) {
            check(ch, itr.next());
        }

        printResults(ch, nums.size() - count, count);
    }

    static void stringOp() {
        int m;
        String str1;
        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Strings:");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.println("Enter string:");
            str1 = sc.next();
            words.add(str1);
        }
        count = 0;
        for (String w : words) {
            palindrome(w);
        }
        printResults(0, words.size() - count, count);
    }

    static void printResults(int ch, int nonCount, int count) {
        switch (ch) {
            case 1 -> System.out.println("The total number of even and odd numbers occurred are:\n" +
                    "The number of even numbers are: " + count +
                    "\nThe number of odd numbers are: " + nonCount);
            case 2 -> System.out.println("The total number of Prime and Non-Prime numbers occurred are:\n" +
                    "The number of PRIME numbers are: " + count +
                    "\nThe numbers which are NOT Prime numbers are: " + nonCount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type");
        System.out.println("1. String");
        System.out.println("2. Integer");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> stringOp();
            case 2 -> integerOp();
            default -> System.out.println("Invalid choice");
        }
    }
}
