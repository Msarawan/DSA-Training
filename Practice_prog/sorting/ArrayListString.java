package sorting;

import java.util.ArrayList;

public class ArrayListString {

    public static void main(String[] args) {
        subsequence("", "abc");
        System.out.println( subsequence("", "abc"));

    }
    static ArrayList<String> subsequence(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
      char ch = up.charAt(0);

        ArrayList<String> left = subsequence(p+ch, up.substring(1));
        ArrayList<String> Right = subsequence(p, up.substring(1));

        left.addAll(Right);
        return left;
    }
}