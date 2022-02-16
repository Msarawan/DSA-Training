import java.util.Scanner;

public class Program1{
    public static void main(String args[])
    {
       System.out.println("Welcome to Java");
       System.out.println("Hello World");       //Hello world

        
        Scanner input = new Scanner(System.in); 
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int Sum = num1 + num2;                  //Sum of 2 number
           
        System.out.println("Sum = " +Sum);


         int n = (int) (43.55f);   
         float m = (float) (55) ;           //Type casting
           System.out.println(n);
           System.out.println(m);


         
         System.out.println("Enter the Salary");

         int Salary = input.nextInt();

         if(Salary > 20000){
              Salary = Salary+5000;
         }else if (Salary > 10000)                  //Conditional Statements- if and if-else ,else if
         {
            Salary += 2000;
         } else
          {
             Salary += 500;
         }
         
          System.out.println("The current salary is:" +Salary);
         

        int number = input.nextInt();
         
         for (int i=1; i<=number; i++){             //For loop program     

             //System.out.print(i + " ");           
             System.out.println(i + " ");
            
            }


         int count = 1;
         while(count <= 5){                      //while loop program
             System.out.println(count);
              count++;
         }

  
        int n1 = 1;
        do {
             System.out.println(n1);           //do-while loop
         }while (n1 != 1);


                                               
         int a = input.nextInt();
         int b = input.nextInt();
         int c = input.nextInt();
                                              //Largest of 3 numbers Program
           int max = 0;
         if (a > b){

             max = a;

         }else{

             max = b;
         }

         if ( c > max){

             max = c;

         }
     System.out.println("maximum numberis:" +max);
           
         char ch = input.next().trim().charAt(0);    //case check
         System.out.println(ch);


         int m1 = 10;
         int m2 = 20;

         if (m1 == 10 && m2 == 20){
              System.out.println("Hello world");   //Bitwise AND
         }

         int m3 = 10;
         int m4 = 20;

         if (m3 == 10 || m4 == 0){
              System.out.println("Welcome JAVA");   //Bitwise OR
         }



    
     int Number = input.nextInt();
       int First = 0;
       int Second = 1;                             //Fibonacci series program
       int count1 = 2; //our count starts from 2

       while (count1 <= Number){ 
           
            int Third = First + Second ;
                First = Second;    
                Second = Third;
                count1 ++;
      
      System.out.println(Third);
           
       }



       int num = 547535;
        int count2 = 0;

        while (num > 0){

           int  rem = num % 10;   // Counting the repeating numbers
            if(rem == 5)
            {
                count2 ++;
            }
            num = num/10;
        }
     System.out.println(count2);
    


     
     
    
   

    
    }
}
