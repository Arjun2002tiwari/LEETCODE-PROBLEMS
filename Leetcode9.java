import java.util.HashMap;

// https://leetcode.com/problems/count-common-words-with-one-occurrence/

public class Leetcode9{
    public static void main(String[] args) {
        String[] words1 = {"b","bb","bbb"};
        String[] words2 = {"a","aa","aaa"};
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(String word : words1){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }
        for(String word : words2){
            if(map2.containsKey(word)){
                map2.put(word, map2.get(word)+1);
            }else{
                map2.put(word, 1);
            }
            
        }
        int count=0;
        for(String word : map.keySet()){
            if(map2.containsKey(word) && map2.get(word)==1 && map.get(word)==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
