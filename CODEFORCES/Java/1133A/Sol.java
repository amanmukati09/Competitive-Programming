import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String time1 = scanner.next();
        String time2 = scanner.next();
        
        String[] h1m1 = time1.split(":");
        String[] h2m2 = time2.split(":");
        
        int h1 = Integer.parseInt(h1m1[0]);
        int m1 = Integer.parseInt(h1m1[1]);
        int h2 = Integer.parseInt(h2m2[0]);
        int m2 = Integer.parseInt(h2m2[1]);
        
        int totalMinutes1 = h1 * 60 + m1;
        int totalMinutes2 = h2 * 60 + m2;
        
        int midpointMinutes = (totalMinutes1 + totalMinutes2) / 2;
        
        int finalHours = midpointMinutes / 60;
        int finalMinutes = midpointMinutes % 60;
        
        // Formatting the output
        System.out.printf("%02d:%02d\n", finalHours, finalMinutes);
        
        scanner.close();
    }
}
