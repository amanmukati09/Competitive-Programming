
import java.util.*;


public class Sol
{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);


    int T = sc.nextInt();

    while(T-- > 0){
        int n = sc.nextInt();
        String s = sc.next();


        int maxDistance = n; // Initialize with total length
            int maxPosition = 0;  // To store the maximum distance from a staircase
            
            // Check the farthest stair from both ends
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    // Calculate the maximum of either the leftmost or the rightmost reach
                    maxPosition = Math.max(maxPosition, Math.max(i + 1, n - i));
                }
            }
            
            // If we have stairs, the time would be twice the farthest stair distance
            maxDistance = Math.max(maxDistance, 2 * maxPosition);
            
            System.out.println(maxDistance);
    }

    sc.close();


    
  }
}