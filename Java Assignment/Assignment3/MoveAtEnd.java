package Assignment3;

public class MoveAtEnd {
    public static void main(String[] args) {
        String str = "abexexdexed";
        String s = "";
        System.out.println(ShiftAtEnd(s, str));
    }

    static int count = 0;
    static String ShiftAtEnd(String p , String str){
      if(str.isEmpty()){
          for (int  i=0; i<count; i++){
              p = p +'x';
          }
          return p;
      }

      char ch = str.charAt(0);
        if(ch == 'x'){
            count ++;
            return ShiftAtEnd(p , str.substring(1));
    }else{
            return ShiftAtEnd(p +ch, str.substring(1));
        }
    }
}