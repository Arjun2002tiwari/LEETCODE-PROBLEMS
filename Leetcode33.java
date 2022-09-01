import java.util.HashSet;

public class Leetcode33 {

    static boolean find(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            set.add(arr[i]);
        }
        if(count==1){
           set.remove(0);
        }
        if(count==2){
            return true;
        }
        for(int k:set){
            if(set.contains(k*2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
         int[] arr={0};
         System.out.println(find(arr));
         
    }
}
