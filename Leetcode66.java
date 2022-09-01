// https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/
public class Leetcode66 {
   public static void main(String[] args) {
    int[] nums = {2,1,4,3};
    int left=2;
    int right=3;
    int i=0;
    int j=0;
    int count=0;
    int m=0;
    for(j=0;j<nums.length;j++){
        if(nums[j]>right){
            i=j+1;
        }
        else if(nums[j]>=left && nums[j]<=right){
            m=j-i+1;
            count=count+m;
        }
        else{
            count=count+m;
        }
    }
    System.out.println(count);
   } 
}
