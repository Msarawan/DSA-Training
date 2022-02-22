package sorting;

import java.util.ArrayList;

public class AsciiChar {
    public static void main(String[] args) {
        subsequenceAscii("", "abc");
        System.out.println( subsequenceAscii("", "abc"));

    }
    static ArrayList<String> subsequenceAscii(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subsequenceAscii(p+ch, up.substring(1));
        ArrayList<String> second = subsequenceAscii(p, up.substring(1));
        ArrayList<String> Third= subsequenceAscii(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(Third);
        return first;
    }
}