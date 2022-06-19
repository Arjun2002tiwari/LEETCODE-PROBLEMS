import java.util.ArrayList;
import java.util.Arrays;


// https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/

public class Leetcode10 {
    static boolean isAnagram(String x,String y){
        if(x.length()!=y.length()) return false;
        char[] xc = x.toCharArray();
        char[] yc = y.toCharArray();
        Arrays.sort(xc);
        Arrays.sort(yc);
        return Arrays.equals(xc,yc);
    }
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        ArrayList<String> list = new ArrayList<String>();
        int i=0;
        list.add(words[i]);
        for(int j=1;j<words.length;j++){
            if(isAnagram(words[i],words[j])){
                i=j;
            }
            else{
                list.add(words[j]);
                i=j;
            }
        }
        System.out.println(list);    
    }
}
