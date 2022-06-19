import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

// https:leetcode.com/problems/sort-array-by-increasing-frequency/

public class Leetcode4 {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
       
        List<HashMap.Entry<Integer, Integer>> list = map.entrySet().stream().collect(Collectors.toList());
        // here we use the lambda function to modifiy the sort method. 
         Collections.sort(list, (a, b) -> {
             if(a.getValue()!=b.getValue()){
                return a.getValue()-b.getValue();
             }
             else{
                return b.getKey()-a.getKey();
             }

         });
        
         int i = 0;
         int[] ret=new int[nums.length];
         for(HashMap.Entry<Integer, Integer> e : list) {
             int count = e.getValue(); 
             while(count-- > 0) {
                 ret[i++] = e.getKey();    
             }
         }
         for(int i1:ret){
             System.out.print(i1+" ");
         }
        System.out.println(list.get(0).getValue());
    }
}
