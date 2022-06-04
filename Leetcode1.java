import java.util.ArrayList;
import java.util.HashMap;

// https://leetcode.com/problems/find-common-characters/

public class Leetcode1{
    public static void main(String[] args) {
        
        String[] words = {"bella","label","roller"};
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i='a'; i<='z'; ++i){
            map.put(i, 100);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(String a:words){
            map2.clear();
            for(char i:a.toCharArray()){
                map2.put(i, map2.getOrDefault(i,0)+1);
            }
            for(char j='a'; j<='z'; ++j){
                map.put(j, Math.min(map.get(j), map2.getOrDefault(j,0)));
            }
        }
        ArrayList<String> output = new ArrayList<>();
        int times;
        for(char i='a'; i<='z'; ++i){
            times = map.get(i);
            while(times>0){
                output.add(i+"");
                --times;
            }
        }
        System.out.println(output);
    }
}