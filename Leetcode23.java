// https://leetcode.com/problems/flipping-an-image/

public class Leetcode23{
    public int[][] flipandInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length / 2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image[0].length - j - 1];
                image[i][image[0].length - j - 1] = temp;
            }
            for(int j = 0; j < image[0].length; j++){
                if(image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = new Leetcode23().flipandInvertImage(image);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}