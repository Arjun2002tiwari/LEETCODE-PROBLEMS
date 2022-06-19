// https://leetcode.com/problems/find-the-difference-of-two-arrays/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Leetcode17 {
    
    public static void main(String[] args) {
        int[] nums1={1,2,3,3};
        int[] nums2={1,1,2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i],map2.get(nums2[i])+1);
            }
            else{
                map2.put(nums2[i],1);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(Integer key:map.keySet()){
            if(!map2.containsKey(key)){
                list2.add(key);
            }
        }
        list.add(0,list2);
        ArrayList<Integer> list3 = new ArrayList<>();
    for(Integer key:map2.keySet()){
        if(!map.containsKey(key)){
           list3.add(key); 
        }
    }
    list.add(1,list3);
    System.out.println(list);
    }
}
