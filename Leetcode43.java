import java.util.Arrays;

// https://leetcode.com/problems/largest-perimeter-triangle/
public class Leetcode43 {
   public static void main(String[] args) {
        int[] nums={2,3,3,4};
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+1]>nums[i+2]){
               int sum=nums[i]+nums[i+1]+nums[i+2];
               max=Math.max(max,sum);
            }
        }
        System.out.println(max);
   } 
}
