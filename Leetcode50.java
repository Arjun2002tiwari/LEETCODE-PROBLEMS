import java.util.*;
// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

public class Leetcode50{
    static List<List<Integer>> groupofPeople(int[] groupsizes){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupsizes.length; i++){
            if(map.containsKey(groupsizes[i])){
                map.get(groupsizes[i]).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupsizes[i], list);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int key: map.keySet()){
            for(int i=0;i<map.get(key).size();i=i+key){
                int start=i;
                int end=i+key;
                List<Integer> list = new ArrayList<>();
                list.addAll(map.get(key).subList(start, end));
                result.add(list);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] groupsizes={2,1,3,3,3,2};
        List<List<Integer>> result = groupofPeople(groupsizes);
        System.out.println(result);

    }
}