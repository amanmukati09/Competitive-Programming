import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int x = c - '0';
            if (i == 0 && x == 9) {
                sb.append(x);
            } else {
                sb.append(Math.min(x, 9 - x));
            }
        }
        
        sc.close();
        System.out.println(sb.toString());
    }
}
