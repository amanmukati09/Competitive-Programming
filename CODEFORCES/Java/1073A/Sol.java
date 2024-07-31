
import java.util.*;


public class Sol
{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    sc.close();


    for(int i = 0;i<n-1;i++){
        if(s.charAt(i) != s.charAt(i+1)){
            System.out.println("YES");
            System.out.println(s.substring(i,i+2));
            return;
        }
    }

    System.out.println("NO");




    
  }
}