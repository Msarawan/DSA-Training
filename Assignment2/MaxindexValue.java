
//Finding the value of maximum index in an array
import java.util.Scanner;

public class MaxindexValue{
    public static void main(String args[]){


  int[] arr = {43,56,78,34,23,32,67,102,99};

   int max= arr[0];
   int  maxIndex = 0;

   for (int i = 1; i < arr.length; i++) {

     if ( arr[i] >= max ) {

       max= arr[i];

      maxIndex = i;

 }

}
   System.out.println(maxIndex);

    }
}    