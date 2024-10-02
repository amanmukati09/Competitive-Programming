import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scanner.nextInt();
            }
        }
        
        // Initialize matrix a with all zeros
        int[][] a = new int[n][m];

        // Construct a based on b
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (b[i][j] == 1) {
                    a[i][j] = 1;
                }
            }
        }

        // Check if OR condition holds
        boolean valid = true;

        // Check rows
        for (int i = 0; i < n; i++) {
            int rowOR = 0;
            for (int j = 0; j < m; j++) {
                rowOR |= a[i][j];
            }
            for (int j = 0; j < m; j++) {
                if (rowOR != b[i][j]) {
                    valid = false;
                    break;
                }
            }
            if (!valid) break;
        }

        // Check columns
        for (int j = 0; j < m && valid; j++) {
            int colOR = 0;
            for (int i = 0; i < n; i++) {
                colOR |= a[i][j];
            }
            for (int i = 0; i < n; i++) {
                if (colOR != b[i][j]) {
                    valid = false;
                    break;
                }
            }
        }

        // Output the result
        if (valid) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
