import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
public class Leetcode44 {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        Arrays.sort(g);
        Arrays.sort(s);
         int i=0;
         int j=0;
         int ans=0;
         while (j<s.length && i<g.length){
             // As per question, cookies should be greater or equal to greed to assign kid
             if (s[j]>=g[i]){
                 ans++;
                 i++;
                 j++;
             }
             else {
                 j++;
             }
         }
        System.out.println(ans);
    }
}
