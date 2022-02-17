import java.util.Scanner;
import java.util.Arrays;

public class Min_Max{

public static void main(String args[]){

int[] array = {2,3, 4, 6, 9, 5};
Arrays.sort(array);

   
   System.out.println ("Minimun number is: " +array[0]);
   System.out.println ("Maximum  number is: " +array[array.length-1]);
   

  }
}
