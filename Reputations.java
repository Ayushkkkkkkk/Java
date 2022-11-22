import java.util.HashMap;
import java.util.Scanner;

public class Reputations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String c = a.toLowerCase();
        String d = b.toLowerCase();
        long asci1 = 0;
        long asci2 = 0;
        for(int i =0;i<c.length();i++){
            asci1 += c.charAt(i)-'0';
            asci2 += d.charAt(i)-'0';
        }
        if(asci1==asci2)
            System.out.println(0);
        else if(asci1>asci2)
            System.out.println(1);
        else
            System.out.println(-1);
    }
}
