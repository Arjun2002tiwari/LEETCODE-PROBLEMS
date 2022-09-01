import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/

public class Leetcode32{
    public static void main(String args[]){
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3,n=3;
        int k=0;
        for(int i=m;i<nums1.length;i++){
            nums1[i]=nums2[k++];
        }
        Arrays.sort(nums1);
    }
}