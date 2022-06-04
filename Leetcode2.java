import java.util.ArrayList;
import java.util.HashMap;

// https://leetcode.com/problems/keyboard-row/


public class Leetcode2 {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        HashMap<Character, Integer> map3 = new HashMap<>();
        for(char i:s1.toCharArray()){
            map.put(i, 1);
        }
        for(char i:s2.toCharArray()){
            map2.put(i, 1);
        }
        for(char i:s3.toCharArray()){
            map3.put(i, 1);
        }
        ArrayList<String> output = new ArrayList<>();
        for(String a:words){
            int count1=1,count2=1,count3=1;
            for(char i:a.toCharArray()){
                i=Character.toLowerCase(i);
                if(!map.containsKey(i)){
                    count1=0;
                    break;
                }
            }
            for(char i:a.toCharArray()){
                i=Character.toLowerCase(i);
                if(!map2.containsKey(i)){
                    count2=0;
                    break;
                }
            }
            for(char i:a.toCharArray()){
                i=Character.toLowerCase(i);
                if(!map3.containsKey(i)){
                    count3=0;
                    break;
                }
            }
            if(count1==1 || count2==1 || count3==1){
                output.add(a);
            }
        }
        System.out.println(output);
        String[] ar=new String[output.size()];
        ar=output.toArray(ar);
        
        
    }
}
