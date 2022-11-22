import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n , input , sum = 0;
        n = sc.nextLong();
        for(int i =0;i<n-1;i++){
            input = sc.nextLong();
            sum +=input;
        }
        System.out.println(n*(n+1)/2-sum);
    }
}
