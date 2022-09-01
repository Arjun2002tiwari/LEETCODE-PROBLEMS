public class Leetcode79 {
    public static void main(String[] args) {
        int[][] nums={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        for(int i=0;i<nums.length;i++){
        int start=0;
        int end=nums[i].length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[i][mid]==target){
                System.out.println(nums[i][mid]);
            }
            if(nums[i][mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    }
}
