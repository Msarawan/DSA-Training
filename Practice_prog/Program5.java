import java.util.Scanner;
import java.util.Scanner;

public class Program5{
    public static void main(String args[]){

        String name1 =  new String ("Welcome");
        String name2 = new String ("Welcome");
                                                            //equals method program
    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));

    String str = "abcba";
    System.out.println(isPalindrome(str));



 //Pretty printing programs
  
  float a = 432.65437f;
  System.out.printf("Formatted number is %.2f" , a);
    System.out.printf("pie : %.3f", Math.PI);          //ans=3.142


    System.out.println(  'a' + 'b');                    //output= 195
    System.out.println("a" + "b");
    System.out.println("a" +1);
  
  //String Builder program

   StringBuilder builder = new StringBuilder();
   for(int i=0; i < 26; i++){
       char ch = (char) ('a' + i);
       builder.append(ch);
   }

   System.out.println(builder.toString());

 
    } 


    //Paliendrom program

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0 ; i < str.length() ; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1 -i);

            if (start != end){
                return false;
            }
        }
        return true;
    }

}