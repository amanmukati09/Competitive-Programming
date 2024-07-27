import java.util.*;
public class BeautifulMatrix{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x=0,y=0;
    for(int i = 0;i<5;i++){
        for(int j = 0;j<5;j++){
            int n = sc.nextInt();
            if(n==1){
                x=i;
                y=j;
            }
        }
    }
     int ans = Math.abs(2-x) + Math.abs(2-y);
     System.out.println(ans);
    sc.close();
  }
}