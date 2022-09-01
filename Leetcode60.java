// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Leetcode60 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int start=0;
        int arr[]=new int[2];
        int end=nums.length-1;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        for(int k:arr){
            System.out.println(k);
        }
    }
}
