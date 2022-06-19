import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/

public class Leetcode14 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()==nums.length){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
