
import java.util.*;


public class Sol
{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-- > 0){

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        int sub = 0;

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            if(i%2 == 0){
                sum = sum + arr[i];
            }
            else{
                sub = sub + arr[i];
            }
        }




        System.out.println(sum - sub);
    }


    
    



    sc.close();


    
  }
}