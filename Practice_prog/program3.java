// Store 5 roll numbers

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class program3{
     public static void main(String args[]){
         int[] arr = new int[5];

            arr[0] = 32;  
            arr[1]= 14;                       //storing rollnumber
            arr[2]= 28; 
            arr[3] = 21;
            arr[4] = 45;
        
  System.out.println(Arrays.toString(arr)); 


  //input by using for loop

   //for(int i=1; i<=arr.length(); i++ ){
     // arr[i] = in.nextInt();
   //}
   // for(int i=1; i<=arr.length(); i++ ){
      //System.out.print(arr[i] + " "); 
    //}


  ArrayList<Integer> list = new ArrayList<>(5);

     list.add(5);                               //adding elements in ArrayList
     list.add(54);
     list.add(456);
     list.add(90);
     list.add(543);
     list.add(999);

     System.out.println(list.contains(999));
     System.out.println(list);                        //Array Functions
     System.out.println(list.set(0 , 43));
     System.out.println(list.remove(2));
     System.out.println(list);
    
      
    
  }
}
 
