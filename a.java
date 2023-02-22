import java.util.*;
import java.io.*;

public class problems{
    static FastWriter out = new FastWriter();
    static FastReader in = new FastReader();
    static final Random random=new Random();
    static long mod=1000000007L;

    public static void main(String[] args) throws IOException {
       // cliefLand();
       // grid();
       solver();
        out.close();
    }

    private static void solver() throws IOException {

    }


    private static void grid() throws IOException{
        int t = in.nextInt();
        while(t-->0){
            int n =8;
            String[][] arr = new String[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = in.nextLine();
                }
            }
            int foundBlue = 0;
            int foundRed = 0;

            for(int i=0;i<n;i++){
                for(int j =0;j<n;j++){
                    if(arr[i][j]=="R"){
                        System.out.println("B");
                        return;
                    }
                    if(arr[i][j]=="B"){
                        System.out.println("R");
                        return;
                    }
                }
            }
        }
        out.close();
    }

    private static void cliefLand() throws IOException{
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            if(n>100){
                n = n-10;
                System.out.println(n);
            }
            else{
                System.out.println(n);
            }
        }
        out.close();
    }

    private static void binaryString() throws IOException{
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            String s = in.nextLine();
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                sb.append(arr[start]);
                start++;
                sb.append(arr[end]);
                end--;
            }
            String ans = sb.toString();
            String[] str = ans.split("");
            Arrays.sort(str);
        }
        out.close();
    }

    private static void happyOrSad() throws IOException{
        int t = in.nextInt();
        char[] vowels = {'a','e','i','o','u'};
        while(t-->0){
            String s = in.next();
            char[] arr = s.toCharArray();
            int count = 0;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                    count++;
                }
                else{
                    max = Math.max(max,count);
                    count = 0;
                }
            }
            max = Math.max(max,count);
            if(max>2){
                System.out.println("Happy");
            }
            else{
                System.out.println("Sad");
            }

           // System.out.println(max);
//            if(max>2){
//                out.println("Happy");
//            }
//            else{
//                out.println("Sad");
//            }
        }
        out.close();
    }

    private static void candies() throws IOException{
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            long ans = 0;
            long count = 1;
            long am = 1;
            while(true){
                ans += am*count;
                count++;
                if(ans==n){
                    break;
                }
                if(ans>n){
                    ans = 0;
                    System.out.println("we in");
                    am = 1;
                    count++;
                }
            }
            System.out.println(ans);
        }
        out.close();
    }

    private static void oddDevisor() throws IOException {
        int t = in.nextInt();
        while (t-->0) {
            long n = in.nextLong();
            ArrayList<Long> divisors = new ArrayList<>();
            optimizedSpace(n, divisors);
            StringBuilder sb = new StringBuilder();
            for (long elem : divisors) {
                if (elem > 1 && (elem & 1) == 1) {
                    sb.append("YES");
                    break;
                }
            }
            if (!sb.toString().isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }



    }

    static void optimizedSpace(long n,ArrayList<Long> divisor) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                if (n / i == i) {
                  //  System.out.println(i);
                } else {
                  //  System.out.println(i + " ");
                    divisor.add(n / i);
                }
        }
    }



        private static void llyaAndBankAccount() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        // - means that she is in a debt and + means the current
        // balance of her in that bank
        //only remove the digit if the integer is less than 0
        // else choose the smallest digit in the integer count and remoce that
        int n = in.nextInt();
        int pos = 0;
        if(n<0){
            pos = Math.abs(n-pos);
        }
        else{
            out.println(n);
            return;
        }
        if(pos%10==0){
            out.println(0);
            return;
        }
        out.close();
    }

    private static void gameWithSticks() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        int m = in.nextInt();

        out.close();
    }

    private static void puzzles() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[m];
        //PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++) {
            arr[i] = in.nextInt();
            //    queue.offer(arr[i]);
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(i+n<= arr.length){
                ans = Math.abs(arr[i]-arr[i+n-1]);
                min = Math.min(min,ans);
            }
            min = Math.min(min,ans);
        }
        min = Math.min(min,ans);
        System.out.println(min);

        out.close();
    }

    private static void dubStep() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        String s = in.nextLine();
        String[] ans = s.split("WUB");
        for(String a:ans){
            if(a!="") {
                out.print(a + " ");
            }
        }
        out.close();
    }

    private static void kefaSteps() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int count =1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        if(max==Integer.MIN_VALUE){
            System.out.println(max);
            return;
        }
        out.println(max);
        out.close();
    }

    private static void gravityFlip() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for(int elem :list){
            out.print(elem+" ");
        }
        out.close();
    }

    private static void evenodds() {
        try{
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            long n = in.nextLong();
            long k = in.nextLong();
            ArrayList<Long> list = new ArrayList<>();
            for(long i=1;i<=n;i++){
                if((i&1)==1){
                    list.add(i);
                }
            }
            for(long i=1;i<=n;i++){
                if((i&1)==0){
                    list.add(i);
                }
            }
            out.println(list.get((int) (k-1)));
            out.close();}
        catch (Exception e){
            System.out.println(e);
        }
    }

    private static void HQ() throws IOException {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        String s = in.nextLine();
        char a = 'H';
        char b = 'Q';
        char c = '9';
        char d = '+';
        char[] array = s.toCharArray();
        for(char elem :array){
            if(elem==a){
                System.out.println("YES");
                return;
            }
            if(elem==b){
                System.out.println("YES");
                return;
            }
            if(elem==c){
                System.out.println("YES");
                return;
            }
        }
        out.println("NO");
        out.close();
    }

    private static void twins() throws  IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for(int i:nums){
            sum +=i;
            queue.offer(i);
        }
        int count = 0;
        sum = sum/2;
        int miniminum=0;
        while(true){
            if(miniminum>sum){
                break;
            }
            miniminum += queue.poll();
            count++;
        }
        System.out.println(count);

        out.close();
    }

    private static void football() throws IOException{
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();
        String s = in.nextLine();
        char[] arr =s.toCharArray();
        int count=1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        if(max>=7){
            out.println("YES");
        }
        else{
            out.println("NO");
        }
        out.close();
    }














    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }



    static  int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }


    static int abs(int a)
    {
        if(a<0)
            return -1*a;
        return a;
    }
    static int max(int a, int b)
    {
        if(a<b)
            return b;
        return a;
    }


    static void ruffleSort(int[] a) {
        int n=a.length;
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }
    static int [] readintarray(int n) {
        int res [] = new int [n];
        for(int i = 0; i<n; i++)res[i] = in.nextInt();
        return res;
    }
    static long [] readlongarray(int n) {
        long res [] = new long [n];
        for(int i = 0; i<n; i++)res[i] = in.nextLong();
        return res;
    }




    }


