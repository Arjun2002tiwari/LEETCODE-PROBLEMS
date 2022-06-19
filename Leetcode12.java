import java.util.HashMap;

// https://leetcode.com/problems/check-array-formation-through-concatenation/

public class Leetcode12 {
    public static void main(String[] args) {
        int[] arr={49,18,16};
        int[][] piece={{16,18,49}};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int count=0;
        for(int i=0;i<piece.length;i++){
            if(piece[i].length==1){
                if(map.containsKey(piece[i][0])){
                    count++;
                }
            }
            else if(map.containsKey(piece[i][0])){
                int k=map.get(piece[i][0]);
                int check=arr.length-k;
                if(check>=piece[i].length){
                for(int j=0;j<piece[i].length;j++){
                    if(piece[i][j]==arr[k+j]){
                        count++;
                    }
                }
             }
            }
        }
       if(count==arr.length){
           System.out.println(count);
       }
    }
}
