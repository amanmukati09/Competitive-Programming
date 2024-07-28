import java.util.Scanner;

public class Solution1141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        if (m % n != 0) {
            System.out.println(-1);
            return;
        }
        
        int quotient = m / n;
        int steps = 0;
        
        while (quotient % 2 == 0) {
            quotient /= 2;
            steps++;
        }
        
        while (quotient % 3 == 0) {
            quotient /= 3;
            steps++;
        }
        
        if (quotient != 1) {
            System.out.println(-1);
        } else {
            System.out.println(steps);
        }
    }
}
