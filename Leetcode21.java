import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// https:leetcode.com/problems/finding-3-digit-even-numbers/

public class Leetcode21 {
    public static void main(String[] args) {
        int[] digits = {2,2,8,8,2};
        int count=0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2!= 0) {
                count++;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 100; i <= 999; i++) {
            set.add(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < digits.length; i++) {
            map.put(digits[i], map.getOrDefault(digits[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : set) {
            if (num % 2 == 0) {
                int k = num;
                int a = num % 10;
                num = num / 10;
                int b = num % 10;
                num = num / 10;
                int c = num%10;
                if(map.containsKey(a) && map.containsKey(b) && map.containsKey(c)){
                    if(a==b && map.get(a)>=2 || map.get(b)>=2){
                        list.add(k);
                    }
                    else if(a==c && map.get(a)>=2 || map.get(c)>=2){
                        list.add(k);
                    }
                    else if(b==c && map.get(b)>=2 || map.get(c)>=2){
                        list.add(k);
                    }
                    else if(a==b && b==c && map.get(a)==3){
                        list.add(k);
                    }
                    else if(a!=b && b!=c && a!=c){
                        list.add(k);
                    }
                }
            }
        }
        System.out.println(list);
        for(Integer k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
         
    }
}
