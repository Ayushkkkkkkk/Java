import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class parity {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int check = 0;
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a==b){
                    System.out.println("YES");
                    break;
                }
                int max = Math.max(a,b);
                int min = Math.min(a,b);
                int div =max/min;
                for(int i=1;i<a;i++){
                    int pow = (int) Math.pow(i,div);
                //    System.out.println(pow);
                    if(pow==a){
                        check+=1;
                    }
                }
                for(int i=1;i<b;i++){
                    int pow = (int) Math.pow(i,div);
                    if(pow==b){
                        check += 1;
                    }
                }
                if(check==1){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
    }
}
