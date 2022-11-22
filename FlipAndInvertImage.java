public class FlipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = new int[4][4];
    }
    public int[][] flip(int[][] image){
        for(int [] row: image){
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1];
                row[image.length-i-1] = temp;

            }
        }
        return image;
    }
}
