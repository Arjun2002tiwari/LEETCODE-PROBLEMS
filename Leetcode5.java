
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


// https://leetcode.com/problems/two-out-of-three/


public class Leetcode5 {
    public static void main(String[] args) {
        int[] nums1={1,1,2,3};
        int[] nums2={3,2};
        int[] nums3={3};
        
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        HashSet<Integer> set3=new HashSet<Integer>();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i:nums1){
            set1.add(i);
            set.add(i);
        }
        for(int i:nums2){
            set2.add(i);
            set.add(i);
        }
        for(int i:nums3){
            set3.add(i);
            set.add(i);
        }
        List<Integer> list=new ArrayList<Integer>();
        for(int i:set){
            if(set1.contains(i)&&set2.contains(i) || set1.contains(i)&&set3.contains(i) || set2.contains(i)&&set3.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
