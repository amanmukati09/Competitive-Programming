import java.util.*;

class Solution282A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> statements = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            statements.add(s);
        }
        int ans = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("X++", 1);
        map.put("--X", -1);
        map.put("++X",1);
        map.put("X--",-1);

        for(String s :  statements){
            int tmp = map.get(s);
            ans = ans + tmp;
        }
        System.out.println(ans);
    }
}