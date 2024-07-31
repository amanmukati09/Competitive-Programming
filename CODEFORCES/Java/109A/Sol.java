import java.util.Scanner;

public class Sol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= n / 4; i++) {
            int remaining = n - (i * 4);
            if (remaining % 7 == 0) {
                int j = remaining / 7;
                StringBuilder result = new StringBuilder();
                for (int k = 0; k < i; k++) {
                    result.append("4");
                }
                for (int k = 0; k < j; k++) {
                    result.append("7");
                }
                System.out.println(result.toString());
                return;
            }
        }
        System.out.println(-1);
    }
}
