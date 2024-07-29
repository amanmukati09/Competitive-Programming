import java.util.*;

public class ATC{

  public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)) {
          int t = sc.nextInt();
          
          while(t-- > 0){
              
              int n = sc.nextInt();
              long[] arr = new long[2*n];

            for(int i = 0;i<2*n;i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            long median = arr[n] - arr[n-1];
            System.out.print(median);
        }    
    }
  }
}