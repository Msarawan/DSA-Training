import java.util.Scanner;
public class Program2{
     public static void main(String args[]){
         int num = 234567;

         int result = 0;
         while (num > 0){
            int rem = num % 10;            //Reverse of number
            num = num/10;
            result = result*10 + rem;   
         }

         System.out.println("Reverse of a number is: "  +result);
     




  Scanner input = new Scanner(System.in);
                                                                 //Calculator program
   int ans = 0;
   while(true){
       System.out.println("Enter the operator: ");
       char op = input.next().trim().charAt(0); 
       //  Sytem.out.println();


       if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

           System.out.println("Enter the two numbers: ");

           int num1 = input.nextInt(); 
           int num2 = input.nextInt();

            // Sytem.out.println();

           if (op == '+'){
               ans = num1 + num2;
           }
           if (op == '-'){
               ans = num1 - num2;
           }
           if (op == '*'){
               ans = num1 * num2;
           }
           if (op == '/'){
              if( num2 != 0 ){
               ans = num1 / num2;
               }
            }
           if (op == '%'){
               ans = num1 % num2;
           }
       }
       else if (op == 'x' || op == 'X'){
            break;
       }else{
           System.out.println("Invalid Operation!");
       }
       System.out.println(ans);
      }

        }
   }