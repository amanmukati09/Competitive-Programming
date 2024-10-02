import java.util.*;

class Solution{


    public int findKthNumber(int n, int k) {

        int curr = 1;
        k--;

        while(k>0){
            long steps = calc(n,curr,curr+1);
            if(steps <= k){
                curr++;
                k-=steps;
            }
            else{
                curr *=10;
                k--;
            }
        }
        return curr;
    }

    private long calc(int n,long curr,long next){
        long steps = 0;

        while(curr <= n){
            steps += Math.min(n+1, next) - curr; 
            curr *= 10;
            steps *= 10;           
        }
        return steps;
    }


    public static void main(String[] args){

        System.out.println(new Solution().findKthNumber(13,2));


    }


}