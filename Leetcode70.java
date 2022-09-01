import java.util.HashMap;

public class Leetcode70{
    public static void main(String[] args){
        int[] nums = {4,5,0,-2,-3,1};
        int k=5;
        int[] res=new  int[k];
        res[0]=1;
        int count = 0, sum = 0;
        for(int a : nums) {
            sum = (sum + a) % k;
            if(sum < 0) sum += k;
            count += res[sum];
            res[sum]++;
        }
        System.out.println(count);
    }
}