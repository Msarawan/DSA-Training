package Assignment3;

public class StringtoInt {
    public static void main(String[] args) {
        String str = "1234";
        System.out.print(stringtoInt(str));
    }

    static int stringtoInt(String str) {
        if (str.length() == 1)
            return (str.charAt(0) - '0');

        double y = stringtoInt(str.substring(1));
        double x = str.charAt(0) - '0';

        x = x * Math.pow(10, str.length() - 1) + y;
        return (int) (x);
    }
}

