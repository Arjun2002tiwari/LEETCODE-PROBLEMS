// https://leetcode.com/problems/find-the-town-judge/

public class Leetcode11 {
    public static void main(String[] args) {
        int n=3;
        int[][] trust={{1,3},{2,3},{3,1}};
        int[] res=new int[n];
        for(int[] i:trust){
            res[i[0]-1]--;
            res[i[1]-1]++;
        }
        for(int i=1;i<=n;i++){
            if(res[i-1]==n-1){
                System.out.println(i);
                break;
            }
        }
    }
}