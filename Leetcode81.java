import java.util.Arrays;

public class Leetcode81 {
    public static void main(String[] args) {
        int[] A={-11,8,10,9,-19,-8,19,-14};
        Arrays.sort(A);
        int pos=0;
        int flag=0;
        int min=Integer.MAX_VALUE;
        int check=min;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                flag=1;
            }
            if(A[i]>0 && min!=A[i]){
                min=Math.min(min,A[i]);
            }
            if(min!=check){
               check=min;
               pos=i;
               System.out.println(pos);
            }
        }
        if(flag==1){
            System.out.println(A[pos]*A[pos-1]);
        }
        else{
            System.out.println(A[pos]*A[pos+1]);
        }
        
    }
}
