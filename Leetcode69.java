// https://leetcode.com/problems/maximum-subarray/
// implementation of kadene's algorithm
public class Leetcode69 {
    public static void main(String[] args) {
        int[] nums = {1};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int i=0;i<nums.length;i++){
            max_ending_here = max_ending_here + nums[i];
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
        }
        System.out.println(max_so_far);
    }
}
