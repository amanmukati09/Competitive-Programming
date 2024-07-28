import java.util.*;
public class SoftDrinking

{
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int[] inp = new int[8];

    for(int i = 0;i<8;i++){
        inp[i]=sc.nextInt();
    }

    int total_drink = inp[1]*inp[2];
    int total_slices = inp[3]*inp[4];
    int total_salt = inp[5];

    int toast_drink = total_drink/inp[6];
    int toast_slices = total_slices;
    int toast_salt = inp[5]/inp[7];

    int totalToasts = Math.min(toast_drink, Math.min(toast_slices, toast_salt))/inp[0];//per friend;
    // took min so we have all necessary items properly. not like salt is lesser and drink is more or vice-versa

    System.out.println(totalToasts);
    sc.close();
  }
}