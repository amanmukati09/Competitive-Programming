import java.util.*;
public class Tram
{
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int ans = 0;
    int index = 0;

    for(int i = 0;i<n;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        ans = ans + b - a;
        index = Math.max(index, ans);
    }

    System.out.println(index);
    sc.close();
  }
}