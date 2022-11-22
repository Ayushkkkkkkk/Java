import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class equalize{
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
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int t=in.nextInt();
            HashMap<Integer,Integer> map1 = new HashMap<>();
            HashMap<Integer,Integer> map2 = new HashMap<>();
            while(t-->0){
                int a = in.nextInt();
                int b = in.nextInt();
                int x = in.nextInt();
                if(Math.abs(a-b)%(2*x)==0){
                    out.println("YES");
                }
                else{
                    out.println("NO");
                }
            }

            out.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }

}

