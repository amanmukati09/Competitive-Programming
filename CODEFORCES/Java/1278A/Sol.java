import java.util.Arrays;
import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            String p = sc.next();  // String p
            String h = sc.next();  // String h

            if (isPermutationSubstring(p, h)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    public static boolean isPermutationSubstring(String p, String h) {
        int n = p.length();
        int m = h.length();

        if (n > m) {
            return false;
        }

        int[] pFreq = new int[26];
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int[] hFreq = new int[26];
        for (int i = 0; i < m; i++) {
            hFreq[h.charAt(i) - 'a']++;

            if (i >= n) {
                hFreq[h.charAt(i - n) - 'a']--;
            }

            if (Arrays.equals(pFreq, hFreq)) {
                return true;
            }
        }

        return false;
    }
}
