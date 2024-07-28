import java.util.Scanner;

public class SAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // cost of first banana
        int n = sc.nextInt(); // initial amount of money
        int w = sc.nextInt(); // number of bananas
        
        // Total cost formula: k * (1 + 2 + 3 + ... + w) = k * (w * (w + 1)) / 2
        int totalCost = k * w * (w + 1) / 2;
        
        // Money to borrow
        int moneyToBorrow = totalCost - n;
        
        // If moneyToBorrow is less than 0, the soldier doesn't need to borrow any money
        System.out.println(Math.max(0, moneyToBorrow));
        
        sc.close();
    }
}
