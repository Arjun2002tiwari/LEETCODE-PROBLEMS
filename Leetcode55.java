// https://leetcode.com/problems/running-sum-of-1d-array/
public class Leetcode55{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int sum=0;
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           sum=sum+nums[i];
            n[i]=sum;
        }
        for(int k:n){
            System.out.println(k);
        }
    }
}