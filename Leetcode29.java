// https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.*;

public class Leetcode29 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> list=new ArrayList<>();
        while (i<nums1.length && j<nums2.length) {
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res=new int[list.size()];
        System.out.println(list);
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
    }
}
