//Java Program to Display Factors of a Number


import java.util.Scanner;
public class Ass5 {
 
  public static void main(String[] args) 
  {
    int num ,i ;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = input.nextInt(); 
    System.out.println("Factors of number  are: ");
 
    for (i = 1; i <= num; i++) 
    {
      if (num % i == 0) 
      {
      System.out.println(i); 
      }
    }
  }
}