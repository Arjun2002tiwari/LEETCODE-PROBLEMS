import java.util.HashSet;

// https://leetcode.com/problems/distribute-candies/

public class Leetcode13 {
    public static void main(String[] args) {
        int[] candyType={6,6,6,6};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int nums=candyType.length/2;
        if(set.size()>nums){
            System.out.println(nums);
        }
        else{
            System.out.println(set.size());
        }
    }
}
