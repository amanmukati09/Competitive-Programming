
import java.util.*;
import java.util.regex.Pattern;


public class Sol
{



    private static final String CASE_1 = "[A-Z]*";
    private static final String CASE_2 = "[a-z][A-Z]*";

    private static boolean MATCH_1(String s){
        return Pattern.matches(CASE_1,s);
    }

  private static boolean MATCH_2(String s){
        return Pattern.matches(CASE_2, s);
    }

  public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            
            if(MATCH_1(s)){
                System.out.println(s.toLowerCase());
            }
            else if(MATCH_2(s)){
                String ans = s.substring(0,1).toUpperCase() + s.substring(1,s.length()).toLowerCase();
                System.out.println(ans);
            }
            else{
                System.out.println(s);
            }   }
  }
}