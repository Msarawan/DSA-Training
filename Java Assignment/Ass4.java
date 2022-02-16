//Write a Java Program to swap two numbers without using the third variable.

public class Ass4{

 public static void main(String[] args) {

  int x = 20;
  int y = 40;

  System.out.println("Before Swapping");
  System.out.println("Value of x is: " + x);
  System.out.println("Value of y is: " + y);

  
  x = x + y; //60
  y = x - y; //20
  x = x - y; //40

  System.out.println("After Swapping");
  System.out.println("Value of x is: " + x);
  System.out.println("Value of y is: " + y);
 }
}