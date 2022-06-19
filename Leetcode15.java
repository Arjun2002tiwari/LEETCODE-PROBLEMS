import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode15 {
    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{1,2},{1,1},{1,2},{2,2}};
        for(int i=0;i<dominoes.length;i++){
            Arrays.sort(dominoes[i]);
        }
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        int pairs=0;
        for(int i=0;i<dominoes.length;i++){
           List<Integer> list=new ArrayList<>();
           list.add(dominoes[i][0]);
           list.add(dominoes[i][1]);
           if(map.containsKey(list)){
               map.put(list,map.get(list)+1);
               pairs+=map.get(list);
           }
           else{
                map.put(list,0);
           }
        }
        System.out.println(pairs);
    }
}