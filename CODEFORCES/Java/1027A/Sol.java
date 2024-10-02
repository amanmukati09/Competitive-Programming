import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Length of the string
            String s = sc.next();  // The string itself

            boolean isValid = true;

            for (int i = 0; i < n / 2; i++) {
                char left = s.charAt(i);
                char right = s.charAt(n - 1 - i);

                if (Math.abs(left - right) != 0 && Math.abs(left - right) != 2) {
                    isValid = false;
                    break;
                }
            }

            System.out.println(isValid ? "YES" : "NO");
        }
        sc.close();
    }
}
