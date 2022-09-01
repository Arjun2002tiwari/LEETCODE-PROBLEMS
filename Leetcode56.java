// https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
public class Leetcode56 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,3};
        int maximumBit=2;
        int xor = 0, n = nums.length;
        int max = (1 << maximumBit)-1;
        System.out.println(max);
        int res[] = new int[n];
        
        for(int e:nums) {
            xor ^= e;
        }
        
        for(int i=0;i<n;i++){
            res[i] = xor^max;
            xor ^= nums[n-i-1];
        }

        
    }
}
