// https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
public class Leetcode45 {
    public static void main(String[] args) {
        int[] arr={6,1,1,13,-1,0,-10,20};
        int sum = 0;
        
        for(int i:arr){
            sum=sum+i;
        }
        
        if(sum%3!=0) {
            System.out.println("false");
        }
        
        int partSum = (sum/3);
        
        int currSum = 0;
        int count = 0;
        int i=0;
        while(i<arr.length) {
           currSum = arr[i]+currSum;
           
            if(currSum==partSum){
                count++;
                currSum = 0;
           } 
           i++; 
        }  
       System.out.println(count>=3); 
    }
}
