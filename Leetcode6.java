// https://leetcode.com/problems/kth-distinct-string-in-an-array/

import java.util.HashMap;


public class Leetcode6 {
    public static void main(String[] args) {
        String[] arr={"a","b","a"};
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String str:arr){
            if(map.containsKey(str)) map.put(str,map.get(str)+1);
            else map.put(str,1);
        }
          
        int count=0;
        int k=3;
        for(String str:arr){
            if(map.get(str)==1) count++;
            if(count==k) {
                System.out.println(str);
            }
        }
    }
}
