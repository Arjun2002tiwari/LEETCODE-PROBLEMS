import java.util.HashMap;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class Leetcode37 {
    public static void main(String[] args) {
        int[] position={2,3,3};
        int cost=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<position.length;i++){
            if(map.containsKey(position[i])){
                map.put(position[i],map.get(position[i])+1);
            }
            else{
                map.put(position[i],1);
            }
        }
        int value=position[0];
        for(int key:map.keySet()){
            if(map.get(key)>map.get(value)){
                value=key;
            }
        }
        for(int i=0;i<position.length;i++){
            if(position[i]!=value){
                int res=Math.abs(position[i]-value);
                if(res%2==0){
                    cost+=0;
                }
                else{
                    cost+=1;
                }
            }
        }
        System.out.println(cost);    
    }
}
