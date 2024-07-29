
import java.util.Scanner;

public class Buttons

{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = 0;

    for(int i = 0;i<n;i++){
        res += (i * (n-i));
    }

    res = res + n;

    System.out.println(res);




   
    sc.close();
  }
}