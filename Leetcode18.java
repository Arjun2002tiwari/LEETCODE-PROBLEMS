import java.util.ArrayList;
import java.util.HashMap;

// https://leetcode.com/problems/minimum-index-sum-of-two-lists/

public class Leetcode18{
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
        }
        int min = Integer.MAX_VALUE;
        ArrayList<String> result = new ArrayList<String>();
        for(String key:map.keySet()){
            if(map2.containsKey(key)){
                if(map2.get(key)+map.get(key)<min){
                    result.clear();
                    min=map2.get(key)+map.get(key);
                    result.add(key);
                }
                else if(map2.get(key)+map.get(key)==min){
                    min=map2.get(key)+map.get(key);
                    result.add(key);
                }
            }    
        }
        String[] res=new String[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        
    }
}