import java.util.*;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of instruments and the available days
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        // Create an array to store the time required for each instrument
        Pair[] instruments = new Pair[n];
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            instruments[i] = new Pair(t, i + 1);
        }
        
        // Sort instruments based on the required time
        Arrays.sort(instruments, Comparator.comparingInt(a -> a.time));
        
        int totalTime = 0;
        List<Integer> selectedInstruments = new ArrayList<>();
        
        // Select instruments as long as the total time does not exceed k
        for (int i = 0; i < n; i++) {
            if (totalTime + instruments[i].time <= k) {
                totalTime += instruments[i].time;
                selectedInstruments.add(instruments[i].index);
            } else {
                break;
            }
        }
        
        // Output the result
        System.out.println(selectedInstruments.size());
        for (int i : selectedInstruments) {
            System.out.print(i + " ");
        }
    }
}

// Helper class to store time and index
class Pair {
    int time, index;
    
    Pair(int time, int index) {
        this.time = time;
        this.index = index;
    }
}
