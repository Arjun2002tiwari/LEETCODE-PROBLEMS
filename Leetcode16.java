import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/shortest-completing-word/

public class Leetcode16 {
    public static void main(String[] args) {
        String LicensePlate="1s3 456";
        String[] words = {"looks","pest","stew","show"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<LicensePlate.length();i++){
            if(Character.isLetter(LicensePlate.charAt(i))){
                String s = LicensePlate.substring(i,i+1);
                s=s.toLowerCase();
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }
                else{
                    map.put(s,1);
                }
            }
        }
        String str="qwertyuikmnbvcdewertyujhbgvcdf";
        List<String> list = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            HashMap<String, Integer> map2 = new HashMap<String, Integer>();
            for(int j=0;j<words[i].length();j++){
                String s = words[i].substring(j,j+1);
                map2.put(s, map2.getOrDefault(s, 0)+1);
            }
            int count=0;
            for(String key:map.keySet()){
                if(!map2.containsKey(key) || map2.get(key)<map.get(key)){
                    count=1;
                }
            }
            if(count==0 && words[i].length()<str.length()){
                list.removeAll(list);
                str=words[i];
                list.add(str);
            }
            map2.clear();
        }
        System.out.println(list);
    }
}
