package Task1;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the type input : Integer or String or exit");
            String in = sc.next();

            switch (in) {
                case "Integer": {
                    System.out.println("1.Reverse the no.");
                    System.out.println("2.Check if palindrome or not");
                    System.out.println("3.Armstrong no. or not");
                    int i = sc.nextInt();
                    System.out.println("Enter the number: ");
                    int n = sc.nextInt();
                    if (i == 1)
                        System.out.println(reverse(n));
                    else if (i == 2)
                        palindrome(n);
                    else if (i == 3)
                        armstrong(n);
                    break;
                }

                case "String": {
                    System.out.println("1.Subsequence of a string");
                    System.out.println("2.Permutation of a string in sorted order");
                    System.out.println("3.Print all possible palindromic partitions");
                    int j = sc.nextInt();
                    System.out.println("Enter a String");
                    String str = sc.next();
                    if (j == 1)
                        Subsequences("", str);
                    else if (j == 2)
                        System.out.println(sortedPermutation("", str));
                    else if (j == 3)
                    partitions("" ,str);
                    break;
                }
                case "exit": {
                    return;
                }
            }
        }
    }

        static int reverse(int n){
            int rev = 0, rem;
            while (n != 0) {
                rem = n % 10;
                rev = (rev * 10) + rem;
                n = n / 10;
            }
            return rev;
        }
        static void palindrome(int n){
            int temp = reverse(n);
            if(temp == n)
                System.out.println("Palindrome number");
            else
                System.out.println("Not a Palindrome number");}

     static void armstrong(int n){
        int tempVar = 0, result = 0 ,rem;
        tempVar = n;
        while (n!=0) {
            rem = n % 10;
            result += Math.pow(rem, 3);
            n = n / 10;
        }
        if (tempVar == result) {
            System.out.println("The number is  Armstrong Number");
        } else {
            System.out.println("The number is not a Armstrong Number");
        }
     }
     static void Subsequences (String p , String str){
        if (str.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = str.charAt(0);
        Subsequences(p + ch, str.substring(1));
        Subsequences(p, str.substring(1));
    }
    static ArrayList<String> sortedPermutation(String p,String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            list.addAll(sortedPermutation(f + ch + s, str.substring(1)));
        }
        list.sort(null);
        return list;
    }

        static void partitions(String p , String str){
           if(str.isEmpty()){
                System.out.println(p);
            }
            for(int i =0; i < str.length(); i++){
                String prefix = str.substring(0, i+1);
                String rem = str.substring(i+1);
                if(isPalindrome(prefix)){
                    partitions(p + "[" + prefix + "]", rem);
                }
            }
        }

    public static boolean isPalindrome( String s){
        int i = 0;
        int j = s.length() - 1;

        while( i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}







