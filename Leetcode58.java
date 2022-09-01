import java.util.*;

// https://leetcode.com/problems/interval-list-intersections/
public class Leetcode58 {
    public static void main(String[] args) {
        int[][]  firstList = {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};
        List<int[]> res=new ArrayList<>();

        int first=0;
        int second=0;
        int Ms,Me;
        while(first<firstList.length && second<secondList.length){
            Ms=Math.max(firstList[first][0],secondList[second][0]);
            Me=Math.min(firstList[first][1],secondList[second][1]);
            if(Ms<=Me){
                res.add(new int[]{Ms,Me});
            }
            if(firstList[first][1]==Me){
                first++;
            }
            if(secondList[second][1]==Me){
                second++;
            }
        }        
    }
}
