import java.util.*;
public class SumOfRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            int placeValue = 1;

            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNumbers.add(digit * placeValue);
                }
                n = n / 10;
                placeValue = placeValue * 10;
            }

            System.out.println(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
