package Assignment3;

import java.util.LinkedHashSet;

public class UniqueChar {
        public static void main (String[]args){
            String str = "aabccdc";
            LinkedHashSet<String> list = new LinkedHashSet<>();
            uniqueCharacter(str , list);
            System.out.println(list);
        }

        static void uniqueCharacter(String str, LinkedHashSet list){

           if(str.isEmpty())
               return;
               list.add(str.charAt(0));
               uniqueCharacter(str.substring(1) ,list);

        }
}




