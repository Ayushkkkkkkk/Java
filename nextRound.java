import java.util.*;
public class nextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while(n-->0){
            int a = sc.nextInt();
            if(a>k){
                count++;
            }
        }
        System.out.println(count);
    }
}
