import java.util.*;

public class Presents{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new TreeMap<>(); 
    for(int i = 1;i<=n;i++){
        int x = sc.nextInt();
        map.put(x,i);
    }
    for(Map.Entry<Integer,Integer> mp : map.entrySet()){
        System.out.print(mp.getValue() + " ");
    }
    sc.close();
  }
}