import java.util.Scanner;
public class BOG{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int[] CHAR = new int[26];
    int cnt = 0;
    for(char c : s.toCharArray()){
        int x = c - 'a';
        CHAR[x]++;
        if(CHAR[x]==1){
            cnt++;
        }
    }
    System.out.println(cnt%2 != 0 ? "IGNORE HIM" : "CHAT WITH HER");
    sc.close();
  }
}