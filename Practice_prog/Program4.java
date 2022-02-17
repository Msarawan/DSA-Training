 //Passing Functions program

import java.util.Scanner;
import java.util.Arrays;

public class Program4{
     public static void main(String args[]){
    
   int[] nums = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(nums));
                                                    //passing Function
    change(nums);
    System.out.println(Arrays.toString(nums));



    
    //Swaping Values in an Array
       
       int[] arr1 = {34 , 7 , 8 , 45 , 3 , 42};
       //swap(arr1 , 1 , 3 );               //array index 1,3 values are get swap after the execution   


        reverse(arr1);    //reverse of array program

       {
           System.out.println(Arrays.toString(arr1));
       }
       
      




     //Maximun value in the array
       System.out.println(maxVal(arr1));   

      //Maxmimum value in a given range   
      System.out.println(maxRange(arr1 ,1 ,4));  


}


     static void change(int[] arr){
      arr[1] = 8;
   }


     static void swap(int[] arr1, int index1, int index2){
      int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
     }

 static int maxVal(int[] arr1){
    int maxVal= arr1[0];
     for (int i = 1; i<=arr1.length-1 ; i++){
        if(arr1[i] > maxVal){
           maxVal = arr1[i];
        }
     }

     return maxVal;
 }


  static int maxRange(int[] arr1 ,int start, int end){
     int maxVal= arr1[start];
     for (int i = 1; i<=end ; i++){
        if(arr1[i] > maxVal){
           maxVal = arr1[i];                               //Function for maximun value in a given range
        }
     }

     return maxVal;
  }
 


   static void reverse(int[] arr1){
      int start = 0;
      int end = arr1.length-1;

      while(start < end){
         swap(arr1,start, end);
         start++;
         end--;

      }
     }

  
} 



   




