import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/find-and-replace-pattern/
public class Leetcode48 {
  public static void main(String[] args) {
    String[] words={"abc","deq","mee","aqq","dkd","ccc"};
    String pattern="abb";
    HashMap<Character, Integer> map = new HashMap<>();
    int k=0;
    String sam="";
    for(int i=0;i<pattern.length();i++) {
      if(map.containsKey(pattern.charAt(i))) {
        map.put(pattern.charAt(i), map.get(pattern.charAt(i)));
        sam=sam+map.get(pattern.charAt(i));
      } else {
        map.put(pattern.charAt(i),k);
        sam=sam+k;
        k++;
      }
    }
    map.clear();
    List<String> list = new ArrayList<>();
    for(int i=0;i<words.length;i++) {
      String res="";
      k=0;
      for(int j=0;j<words[i].length();j++) {
        if(map.containsKey(words[i].charAt(j))) {
          map.put(words[i].charAt(j), map.get(words[i].charAt(j)));
            res=res+map.get(words[i].charAt(j));
        } 
        else {
        map.put(words[i].charAt(j),k);
        res=res+k;
        k++;
        }
      }
      if(sam.equals(res)){
        list.add(words[i]);
      }
      map.clear();
    }
    System.out.println(list);
  }
}
