public class Leetcode83{
    static void reverse(int[] nums,int start,int end){
        if(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            reverse(nums,start+1,end-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        reverse(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}