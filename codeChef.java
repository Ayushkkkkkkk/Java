import java.util.HashMap;
import java.util.Scanner;

public class codeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <arr.length ; i++) {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                max = Math.max(max,map.get(arr[i]));
            }
            int ans = Math.abs(n-max);
            System.out.println(ans);
        }
    }
}
