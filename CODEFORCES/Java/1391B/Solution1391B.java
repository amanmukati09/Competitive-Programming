import java.util.Scanner;

public class Solution1391B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            char[][] grid = new char[n][m];
            
            for (int i = 0; i < n; i++) {
                String row = sc.next();
                grid[i] = row.toCharArray();
            }
            
            int changes = 0;
            
            // Check the last row except the last cell
            for (int i = 0; i < m - 1; i++) {
                if (grid[n - 1][i] == 'D') {
                    changes++;
                }
            }
            
            // Check the last column except the last cell
            for (int i = 0; i < n - 1; i++) {
                if (grid[i][m - 1] == 'R') {
                    changes++;
                }
            }
            
            System.out.println(changes);
        }
        
        sc.close();
    }
}
