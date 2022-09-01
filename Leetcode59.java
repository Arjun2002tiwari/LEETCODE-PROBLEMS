import java.util.Arrays;

// https://leetcode.com/problems/the-k-strongest-values-in-an-array/
public class Leetcode59 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
        Arrays.sort(arr);  
        int median=arr[(arr.length-1)/2];
        int i=0;
        int j=arr.length-1;
        int res=0;
        int[] result=new int[k];
        while(res<k)
        {
        if(Math.abs(arr[i]-median)>Math.abs(arr[j]-median))
        {
            result[res]=arr[i];
            i++;
            res++;
        }
        else{
            result[res]=arr[j];
            j--;
            res++;
        }
    }  
    }
}
