// Java Program to check given number is Palindrome or not.

import java.util.Scanner;

 public class Ass2{  
     public static void main(String args[]){  
        Scanner in = new Scanner(System.in);
        
         System.out.println("Enter a number ");  
         int n = in.nextInt();

         int rem,sum=0,temp;   
  
          temp=n;    
           while(n>0){    
            rem=n%10;  
            sum=(sum*10)+rem;    
             n=n/10;    
          }   
  
          if(temp==sum)    
            System.out.println("palindrome number ");    
         else    
            System.out.println("not palindrome");    
       }  
    }  


