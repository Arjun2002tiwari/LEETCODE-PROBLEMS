// https://leetcode.com/problems/sort-array-by-parity/

public class Leetcode25 {
    public static void main(String[] args) {
        int[] nums = {0};
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[odd];
                nums[odd] = temp;
                odd++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
