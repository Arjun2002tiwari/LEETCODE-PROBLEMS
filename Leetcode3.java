import java.util.HashMap;

// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/

public class Leetcode3 {
    public static void main(String[] args) {
        String[] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i:chars.toCharArray()){
            map.put(i, map.getOrDefault(i, 1)+1);
        } 
        HashMap<Character, Integer> map2 = new HashMap<>();
        int sum=0;
        for(String a:words){
           for(char i:a.toCharArray()){
               map2.put(i, map2.getOrDefault(i, 1)+1);
           }
           int count=1;
           for(char i:a.toCharArray()){
               if(map.containsKey(i)){
                    if(map.get(i)<map2.get(i)){
                        count=0;
                        break;
                    }
                }
                else{
                    count=0;
                    break;
                }
            }
            if(count==1){
                sum=sum+a.length();
            }
            map2.clear();
        }
        System.out.println(sum);
    }
}
