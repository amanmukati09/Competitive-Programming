import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of days
        int x = scanner.nextInt(); // left days to check
        int y = scanner.nextInt(); // right days to check

        int[] pollutionLevels = new int[n];

        for (int i = 0; i < n; i++) {
            pollutionLevels[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean isValid = true;

            for (int j = 1; j <= x; j++) {
                if (i - j >= 0 && pollutionLevels[i] >= pollutionLevels[i - j]) {
                    isValid = false;
                    break;
                }
            }

            for (int j = 1; j <= y; j++) {
                if (i + j < n && pollutionLevels[i] >= pollutionLevels[i + j]) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}
