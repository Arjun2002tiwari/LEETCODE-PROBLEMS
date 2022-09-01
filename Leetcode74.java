import java.util.Arrays;

// https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
public class Leetcode74 {
    public static void main(String[] args) {
        int[] arr={1,100,1000};
        Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
           if(arr[i]-arr[i-1]>1){
               arr[i]=arr[i-1]+1;
           }
        }
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           Max=Math.max(Max,arr[i]);
        }
        System.out.println(Max);
        
    }
}
