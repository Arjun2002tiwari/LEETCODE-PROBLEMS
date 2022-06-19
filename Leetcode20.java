import java.util.HashSet;

// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/

public class Leetcode20 {
    public static void main(String[] args) {
        int[][] matrix = {{2,3,1},{1,2,3},{1,2,3}};
        int n=matrix.length;
        HashSet<Integer> set1=new HashSet<>();
        for(int i=1;i<=n;i++){
            set1.add(i);
        }
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            set2.addAll(set1);
            set3.addAll(set1);
            for(int j=0;j<n;j++){
                set2.remove(matrix[i][j]);
                set3.remove(matrix[j][i]);
            }
            if(set2.size()!=0 || set3.size()!=0){
                count=1;
            }
        }
        if(count==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
