// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Leetcode31 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int slow=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[slow]){
                continue;
            }
            else{
                nums[slow+1]=nums[i];
                slow++;
                count++;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println(count);

    }
}
