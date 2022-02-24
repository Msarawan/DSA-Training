package Assignment3;

public class StringReverseCheck {
    public static void main(String[] args) {
        String str1 = "abccba";
        String str2 = "abccba";

        System.out.println(isReverse(str1,str2));
    }

    static boolean isReverse(String s1,String s2){
        String str = "";
        for(int i=s1.length()-1; i>=0; i--){
            char ch = s1.charAt(i);
            str = str +ch;
        }
        if(str.equals(s2)){
            return true;
        }else
            return false;
    }
}
