import java.util.HashMap;

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

public class Leetcode8{
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()==n){
               System.out.println(entry.getKey());
           }
       }
    }
}