import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Number of chocolate bars
        int[] chocolates = new int[n];
        
        // Read the sweetness levels of the chocolate bars
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        
        long maxSweetness = chocolates[n - 1];
        long totalSweetness = chocolates[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            maxSweetness = Math.min(maxSweetness - 1, chocolates[i]);
            if (maxSweetness < 0) {
                maxSweetness = 0;
            }
            totalSweetness += maxSweetness;
        }
        
        System.out.println(totalSweetness);
    }
}
