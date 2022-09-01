import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode80 {
    public static void main(String[] args) {
        String s="rat";
        String t="tar";
        char[] chars=s.toCharArray();
        char[] chars1=t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        if(Arrays.equals(chars,chars1)){
            System.out.println("true");
        }
    }
}
