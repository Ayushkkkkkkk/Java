import java.util.*;
import java.io.*;

public class word{
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
            String s = in.nextLine();
            String upper = s.toUpperCase();
            String lower = s.toLowerCase();
            int lower_no = 0;
            int upper_no = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==upper.charAt(i)){
                    upper_no++;
                }
                else{
                    lower_no++;
                }
            }
            if(upper_no>lower_no){
                out.println(s.toUpperCase());
            }
            else if(upper_no<lower_no){
                out.println(s.toLowerCase());
            }
            else{
                out.println(s.toLowerCase());
            }
            out.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }

}


