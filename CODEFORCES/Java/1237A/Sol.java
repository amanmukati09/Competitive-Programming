import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int adjustment = 0; // To alternate between adding/subtracting for odd numbers

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] / 2); // Print directly for even numbers
            } else {
                // For odd numbers, alternate between rounding up and down to balance the overall sum
                if (adjustment == 0) {
                    System.out.println((arr[i] + 1) / 2); // Round up
                    adjustment = 1;
                } else {
                    System.out.println((arr[i] - 1) / 2); // Round down
                    adjustment = 0;
                }
            }
        }
        sc.close();
    }
}
