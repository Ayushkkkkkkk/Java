import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
import java.io.*;

public class sdc1{
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
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int rem = 0;
            while(n>0){
                 rem = n%10;
                 list.add(rem);
                 n = n/10;
            }

            int max = 0;
            int min = Integer.MAX_VALUE;
            int temp = 0;
            for(int i=0;i<list.size();i++){
                if(list.get(i)>4&&list.get(i)!=9){
                    temp =list.remove(i);
                    list.add(9-temp);
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i:list){
                sb = sb.append(i);
            }
            System.out.println(sb.toString());
            out.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }

}

