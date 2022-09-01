import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/

public class Leetcode40 {
    public static void main(String[] args) {
        int[] cost={1,2,3,4,5,6};
        Arrays.sort(cost);
        int sum=0;
        for(int i=0;i<cost.length;i++){
            sum+=cost[i];
        }
        for(int i=cost.length-3;i>=0;i=i-3){
            sum-=cost[i];
        }
        System.out.println(sum);    
    }    
}
