public class PrintNum {
    public static void main(String[] args) {
        int n = 5;
        num(5);
        num1(1);
    }
    public static  void num(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }


public static void num1(int n){
        if(n>5){
        return;
        }
        System.out.println(n);
        num1(n+1);
        }
}

