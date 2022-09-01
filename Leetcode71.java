public class Leetcode71 {
    public static void main(String[] args) {
        int[] nums={2,5};
        int sum = 0;
        for (int x : nums) sum += x; 

        // step 2: loop to check if condition is satisfied. Return index if found
        for (int i = 0, ls = 0; i <= nums.length - 1; ls += nums[i++]) {
            if (ls * 2 == sum - nums[i]) return i;
        }
        
        // step 3: return -1 if not found
        return -1; 
    }
}
