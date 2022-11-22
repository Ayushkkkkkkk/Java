import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int odd = 0;
            int even = 0;
            for(int elem :arr){
                if((elem&1)==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(even>odd){
                System.out.println(even);
            }
            else {
                int partAns = Math.min(even, odd);
                System.out.println(partAns);
            }
        }
    }
}
