// https://leetcode.com/problems/two-furthest-houses-with-different-colors/
public class Leetcode39 {
   public static void main(String[] args) {
    int[] colors={4,4,4,11,4,4,11,4,4,4,4,4};
    int n=colors.length;
    int ans=0;
    int max=0;
    int p=0;
    while(p<n){
        for(int i=n-1;i>=p;i--){
            if(colors[i]!=colors[p]){
                ans=Math.abs(i-p);
                break;
            }
        }
        max=Math.max(max,ans);
        p++;
    }
    System.out.println(max);
   } 
}
