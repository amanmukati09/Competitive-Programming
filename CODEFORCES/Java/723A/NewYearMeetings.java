import java.util.*;

public class NewYearMeetings{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    List<Integer> ls = new ArrayList<>(List.of(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    Collections.sort(ls);
    int a = ls.get(0);
    int b = ls.get(1);
    int c = ls.get(2);
    System.out.println(c-b+b-a);
    sc.close();
  }
}