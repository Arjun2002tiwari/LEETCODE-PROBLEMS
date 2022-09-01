import java.util.ArrayList;
import java.util.HashSet;

// https://leetcode.com/problems/intersection-of-two-arrays/

public class Leetcode28 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++) {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            set2.add(nums2[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(set.size()>set2.size()) {
            for(int i:set2){
                if(set.contains(i)) {
                   list.add(i); 
                }
            }
        }
        else{
            for(int i:set){
                if(set2.contains(i)) {
                    list.add(i);
                }
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        for(int k:res){
        System.out.println(k);
        }
        
    }
}
