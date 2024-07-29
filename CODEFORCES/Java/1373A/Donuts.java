
import java.util.Scanner;



public class Donuts

{
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while(t-- >0){


        
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();


    if(a<c){
        System.out.println("1");
    }
    else{
        System.out.println("-1");
    }

    if(c < a*b){
            System.out.println(b);
    }
    else{
        System.out.println("-1");
    }
    }
    sc.close();
  }
}