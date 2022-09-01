import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/shortest-distance-to-a-character/

public class Leetcode26 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] left=new int[s.length()];
        int[] right=new int[s.length()];
        int[] res=new int[s.length()];
        Arrays.fill(left, Integer.MAX_VALUE);
        Arrays.fill(right, Integer.MAX_VALUE);

        int runDis=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
               runDis=0;
               left[i]=runDis; 
            }
            else if(runDis!=Integer.MAX_VALUE){
                runDis++;
                left[i]=runDis;
            }
        }
        runDis=Integer.MAX_VALUE;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
               runDis=0;
               right[i]=runDis; 
            }
            else if(runDis!=Integer.MAX_VALUE){
                runDis++;
                right[i]=runDis;
            }
        }
        for(int i=0;i<s.length();i++){
            res[i]=Math.min(left[i],right[i]);
        }
        
        for(int i=0;i<s.length();i++){
            System.out.print(res[i]+" ");
        }
    }
}
