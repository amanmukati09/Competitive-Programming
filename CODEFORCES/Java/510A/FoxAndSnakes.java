import java.util.*;

public class FoxAndSnakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows
        int m = sc.nextInt(); // number of columns

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else if (i % 4 == 2) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            } else {
                System.out.print("#");
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
            }
            System.out.println(); // New line after each row
        }
        sc.close();
    }
}
