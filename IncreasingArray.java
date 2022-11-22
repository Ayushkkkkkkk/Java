
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        int moves = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                long a = arr[i];
                long b = arr[i-1];
                while(a!=b) {
                    if(a!=b){
                        a = a+1;
                        moves++;
                    }
                    if(a==b){
                        continue;
                    }
                }
            }
        }
        System.out.println(moves);

    }
}
