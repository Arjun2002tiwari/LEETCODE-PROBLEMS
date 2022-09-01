// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
public class Leetcode35{
    public static void main(String[] args) {
        int[] nums = {8};
        int i=0,n=1;
        while(n<nums.length){
            if(nums[n-1]>=nums[n]){
                i++;
                nums[n]++;
            }
            else{
                n++;
            }
        }
        System.out.println(i);
    }
}