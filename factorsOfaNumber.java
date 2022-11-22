import java.util.ArrayList;
import java.util.Scanner;

public class factorsOfaNumber {
    public static void main(String[] args) {
      //  bruteforce();
        optimized();
    }
    //0(n)
    static void bruteforce(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.println(i);
        }
    }
    static void optimized(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                if(n/i==i){
                    System.out.println(i);
                }else{
                System.out.println(i + " " +n/i);
         }
        }
    }
    static void optimizedSpace(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
                if(n/i==i){
                    System.out.println(i);
                }else{
                    System.out.println(i + " " );
                    list.add(n/i);
                }
        }

    }
}
