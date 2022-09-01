// https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
public class Leetcode62 {
    public static void main(String[] args) {
        int[] nums1={30,29,19,5};
        int[] nums2={25,25,25,25,25};
        int first=0,second=0;
        int max=0;
        while(first<nums1.length && second<nums2.length){
            if(nums1[first]>nums2[second]){
                first++;
            }
            else{
                max=Math.max(max,second-first);
                second++;
            }
        }
        System.out.println(max);
    }
}
