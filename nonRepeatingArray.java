public class nonRepeatingArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }
        System.out.println(ans);
    }
}
