public class FactorialNum {
    public static void main(String[] args) {
        int n = 5;
        fact(n);
        int ans = fact(n);
        System.out.println("factorial of num is: " +ans);
    }

    public static int fact(int n){

        if(n==1 || n==0){
            return 1;
        }

        int factnumber = fact (n-1);
        int factNum = n * fact(n-1);
        return factNum;
    }
}
