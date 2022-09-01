import java.util.Arrays;

// https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
public class Leetcode42{
    public static void main(String[] args) {
        int[]  nums = {2,-3,-1,5,-4};
        int k = 2;
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(k>0){
            if(nums[i]<0){
                k--;
                nums[i]=-nums[i];
            }
            else if(nums[i]==0){
                k=0;
            }
            else{
                if(k%2==0){
                    k=0;
                }
                else{
                    nums[i]=-nums[i];
                    k=0;
                }
            }
        }
    }
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
    }
    System.out.println(sum);
    }
}