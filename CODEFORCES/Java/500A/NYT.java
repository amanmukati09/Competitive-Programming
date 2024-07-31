import java.util.Scanner;

public class NYT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of cells
        int t = scanner.nextInt(); // Target cell
        int[] portals = new int[n]; // Array to store the jumps
        
        for (int i = 1; i < n; i++) {
            portals[i] = scanner.nextInt();
        }

        boolean[] visited = new boolean[n]; // Array to keep track of visited cells
        int currentCell = 1; // Start from cell 1

        // Traverse through the cells
        while (currentCell < t) {
            if (visited[currentCell]) {
                System.out.println("NO");
                return;
            }
            visited[currentCell] = true;
            currentCell += portals[currentCell];
        }

        if (currentCell == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
