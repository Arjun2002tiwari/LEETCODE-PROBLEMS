import java.util.HashMap;

public class Leetcode76 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int k=5;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(k-nums[i]) && k-nums[i]==nums[i] && map.get(nums[i])>=2){
                count++;
                map.put(nums[i],map.get(nums[i])-2);
            }
            else if(map.containsKey(k-nums[i]) && k-nums[i]!=nums[i] && map.get(k-nums[i])>=1  && map.get(nums[i])>=1){
                count++;
                map.put(nums[i],map.get(nums[i])-1);
                map.put(k-nums[i],map.get(k-nums[i])-1);
            }
        }
        System.out.println(count);
    }
}
