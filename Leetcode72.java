import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// TWO SUM

public class Leetcode72{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        System.out.println(map);
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value)){
                if(map.get(value).size()>1){
                    res[0]=map.get(value).get(0);
                    res[1]=map.get(value).get(1);
                    break;
                }
                else if(nums[i]==value && map.get(value).size()==1){
                    continue;
                }
                else{
                    res[0]=i;
                    res[1]=map.get(value).get(0);
                    break;
                }
            }
            
        }
        System.out.println(res[0]+" "+res[1]);
    }
}