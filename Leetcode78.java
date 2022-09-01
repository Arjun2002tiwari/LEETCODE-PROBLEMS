import java.util.Arrays;

public class Leetcode78{
    public static void main(String[] args) {
        int[][] costs={{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        Arrays.sort(costs, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
        for(int[] cost:costs){
            System.out.println(cost[0]+" "+cost[1]);
        }

    }
}