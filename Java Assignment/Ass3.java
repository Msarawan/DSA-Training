// Java Program to Find GCD of Two Numbers public class FindGCDExample2  

import java.util.Scanner;

public class Ass3{
public static void main(String args[]) { 
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int gcd = 0;
    for (int i = 1; i <= num1 && i <= num2; i++) {
        if (num1 % i == 0 && num2 % i == 0) {
            gcd = i;
        }
    }
    System.out.println("the GCD of the two numbers  is: " +gcd);
}
}



