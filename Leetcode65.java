import java.util.Arrays;

// https://leetcode.com/problems/boats-to-save-people/
public class Leetcode65 {
    public static void main(String[] args) {
        int[] people ={3,2,2,1};
        Arrays.sort(people);
        int limit=3;
        int count=0;
        int start=0;
        int end=people.length-1;
        while(start<=end){
            if(people[start]+people[end]<=limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            count++;    
        }
        System.out.println(count);
    }
}
