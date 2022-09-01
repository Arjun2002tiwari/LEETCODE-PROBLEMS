import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Leetcode52{
    public static void main(String[] args) {
        int[][] matches={{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        TreeSet<Integer> set=new TreeSet<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<matches.length;i++){
            set.add(matches[i][0]);
            if(map.containsKey(matches[i][1])){
                map.put(matches[i][1],map.get(matches[i][1])+1);
            }
            else{
                map.put(matches[i][1],1);
            }    
        }
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(int i:set){
            if(!map.containsKey(i)){
                list1.add(i);
                
            }
        }
        res.add(list1);
        List<Integer> list2=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==1){    
                list2.add(i);
            }
        }
        res.add(list2);
        System.out.println(res);
    }
}