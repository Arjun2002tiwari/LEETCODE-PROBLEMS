// https://leetcode.com/problems/product-of-array-except-self/
public class Leetcode73 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int product=1;
        int count=0;
        for(int a:nums){
            if(a==0){
                count++;
                continue;
            }
            else{
                product*=a;
            }
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=product;
            if(count==1){
                if(nums[i]==0){
                    res[i]=product;
                }else{
                    res[i]=0;
                }
            }
            else if(count>1){
                res[i]=0;
            }
            else{
                res[i]=temp/nums[i];
            }
        }
        for(int a:res){
            System.out.println(a);
        }
    }
}
