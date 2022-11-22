import java.util.Scanner;

public class wierdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
        System.out.println(n);
        while(n!=1){
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            }
            else {
                n = n * 3 + 1;
                System.out.println(n);
            }
        }
    }
}
