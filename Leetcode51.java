
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

// https://leetcode.com/problems/display-table-of-food-orders-in-a-restaurant/
public class Leetcode51{
    public static void main(String[] args) {
        String[][] orders = {{"David","3","Ceviche"},{"Corina","10","Beef Burrito"},{"David","3","Fried Chicken"},{"Carla","5","Water"},{"Carla","5","Ceviche"},{"Rous","3","Ceviche"}};

        TreeMap<Integer,HashMap<String,Integer>> map = new TreeMap<>();
        TreeSet<String> set = new TreeSet<>();
        for(int i=0;i<orders.length;i++){
            int tableNo = Integer.parseInt(orders[i][1]);
            String food = orders[i][2];
            if(!map.containsKey(tableNo)){
                HashMap<String,Integer> hm = new HashMap<>();
                hm.put(food,1);
                map.put(tableNo,hm);
            }
            else{
                HashMap<String,Integer> hm = map.get(tableNo);
                if(hm.containsKey(food)){
                    hm.put(food,hm.get(food)+1);
                }
                else{
                    hm.put(food,1);
                }
                map.put(tableNo,hm);
            }
            set.add(food);
        }
        List<List<String>> list = new ArrayList<>();
        List<String> l1= new ArrayList<>();
        l1.add("Table");
        for(String s:set){
            l1.add(s);
        }
        list.add(l1);
        for(Integer i:map.keySet()){
            List<String> l2 = new ArrayList<>();
            l2.add(i.toString());
            HashMap<String,Integer> hm = map.get(i);
            for(String s:set){
                if(hm.containsKey(s)){
                    l2.add(hm.get(s).toString());
                }
                else{
                    l2.add("0");
                }
            }
            list.add(l2);
        }
        System.out.println((list.get(0)).get(1));
    }
}