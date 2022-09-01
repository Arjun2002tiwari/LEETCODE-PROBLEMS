// https://leetcode.com/problems/remove-element/

public class Leetcode30{
    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int j=0,val=2,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
                count++;
            }
        }
        System.out.println(count);

    }
}