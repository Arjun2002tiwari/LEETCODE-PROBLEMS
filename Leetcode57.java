import java.util.Arrays;

// https://leetcode.com/problems/find-the-highest-altitude/
public class Leetcode57 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] res=new int[gain.length+1];
        res[0]=0;
        for(int i=1;i<res.length;i++){
            res[i]=res[i-1]+gain[i-1];
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
        Arrays.sort(res);
        

    }
}
