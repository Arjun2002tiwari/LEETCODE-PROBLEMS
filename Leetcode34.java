import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int i=0;
        int j=0;
        int start=0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
    }
}
