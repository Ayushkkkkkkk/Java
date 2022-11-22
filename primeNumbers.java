import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        evenOdd(sc.nextInt());
    }
    static void evenOdd(int n ){
        if(((n&1)==0)){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
