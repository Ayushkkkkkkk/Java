public class ithBit {
    public static void main(String[] args) {
        int n = 5;
        int ans = n&(1<<(n-1));
        System.out.println(ans);
    }
}
