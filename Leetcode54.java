import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/
public class Leetcode54 {
   public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s,list);
            }

        }
        List<List<String>> list = new ArrayList<>();
        for(String key: map.keySet()) {
            list.add(map.get(key));
        }
        System.out.println(list);
   } 
}
