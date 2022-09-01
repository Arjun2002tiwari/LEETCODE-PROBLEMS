// https://leetcode.com/problems/sort-array-by-parity-ii/

public class Leetcode27 {
    public static void main(String[] args) {
        int[] nums={4,2,5,7};
        int even=0;
        int odd=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[even]=nums[i];
                even+=2;
            }
            else{
                res[odd]=nums[i];
                odd+=2;
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
