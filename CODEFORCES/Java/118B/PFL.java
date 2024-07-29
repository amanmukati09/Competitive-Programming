import java.util.*;

public class PFL {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }


        for(int i = -n;i<=n;i++){
            int x = Math.abs(i);

            for(int j = 0;j<x;j++){
                    System.out.print("  ");
            }
            for(int j = 0;j<=n-x;j++){
                System.out.print(j);
                if(j != n-x){
                    System.out.print(" ");
                }
            }
            for(int j = n-x-1;j>=0;j--){
                System.out.print(" "+j);
            }

            System.out.println();
        }



        
      


    }
}
