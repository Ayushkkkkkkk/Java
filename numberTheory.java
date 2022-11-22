import java.util.*;
import java.io.*;

public class numberTheory{
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
    public static void main(String[] args) throws IOException {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int n = in.nextInt();
            int count=0;
            for (int i = 1; i*i <=n ; i++) {
                if(n%i==0){
                    count++;
                }
                if(i!=n/i){
                    count++;
                }

            }
            out.println(count);
            out.close();
        } catch (Exception e) {
            FastWriter out = new FastWriter();
            out.println(e);
            return;
        }
    }


}


