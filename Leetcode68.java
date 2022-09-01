// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
public class LEETCODE68 {
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int threshold=6;
        int min=0,max=1000000;
        while(min<max){
            int mid=min+(max-min)/2;
            if(check(nums,threshold,mid)){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        System.out.println(min);
    }

    private static boolean check(int[] nums, int threshold, int mid) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int temp=(int) Math.ceil((double)nums[i]/mid);
            sum+=temp;
        }
        return sum<=threshold;
    }
}
