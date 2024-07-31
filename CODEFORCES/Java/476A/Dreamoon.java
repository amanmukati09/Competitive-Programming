import java.util.Scanner;

public class Dreamoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        int minSteps = (n + 1) / 2;

        // If m cannot divide the minimum steps, find the next multiple of m
        if (minSteps % m != 0) {
            minSteps = ((minSteps / m) + 1) * m;
        }

        // Check if the calculated steps are within the limit of total steps n
        if (minSteps <= n) {
            System.out.println(minSteps);
        } else {
            System.out.println(-1);
        }
    }
}
