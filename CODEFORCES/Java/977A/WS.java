import java.util.*;
public class WS

{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int  k = sc.nextInt();
    while(k != 0){
        if((int) n%10L == 0){
            n = n/10L;
        }
        else{
            n = n - 1L;
        }
        k--;
    }
    System.out.println(n);
    sc.close();

  }
}