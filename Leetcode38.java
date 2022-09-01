import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
public class Leetcode38 {
    public static void main(String[] args) {
        int[] nums = {4,4,7,6,7};
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
        }
        int r1=nums[nums.length-1];
        List<Integer> res = new ArrayList<>();
        if(nums.length==1){
        res.add(r1);
        }
        else{
            int valueSum=r1;
            res.add(r1);
            for(int i=nums.length-2;i>=0;i--){
                if(sum-valueSum>=valueSum){
                    res.add(nums[i]);
                    valueSum+=nums[i];
                }
            }
        }
        System.out.println(res);
    }
}
