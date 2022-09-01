// https://leetcode.com/problems/find-the-duplicate-number/
public class Leetcode61 {
   public static void main(String[] args) {
        int[] nums={1,3,2,2};
        int slow=0,fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast)
                break;
        }
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        System.out.println(fast);
   } 
}
