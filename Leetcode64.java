// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
public class Leetcode64 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                nums[i++]=nums[j];
            }
        }
        System.out.println(i);
    }
}
