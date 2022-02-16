// Java Program to Find GCD of Two Numbers public class FindGCDExample2  

import java.util.Scanner;

public class Ass3{
public static void main(String args[]) { 
 
   int n1=8, n2=4;
   while(n1!=n2){
   
     if(n1>n2){
       n1=n1-n2; 
        System.out.println("GCD of n1 and n2 is: " +n1);  
     }else {
     n2=n2-n1;  
      System.out.println("GCD of n1 and n2 is: " +n2);  }
   }
}    
} 


