import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Leetcode47{
    public static void main(String[] args) {
        int[][] logs={{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k=5;
        HashMap<Integer,Set<Integer>> map=new HashMap<>();
        for(int i=0;i<logs.length;i++){
            if(map.containsKey(logs[i][0])){
                map.get(logs[i][0]).add(logs[i][1]);
            }
            else{
                Set<Integer> set=new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0],set);
            }
        }
        int[] res=new int[k];
        for(int key:map.keySet()){
            res[map.get(key).size()]++;
        }
        for(int i=1;i<=k;i++){
            System.out.print(res[i]+" ");
        }
    }
}