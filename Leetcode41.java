// https://leetcode.com/problems/lemonade-change/
public class Leetcode41 {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        int c5=0;
        int c10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                c5++;
            }
            else if(bills[i]==10){
                c5=c5-1;
                c10++;
            }
            else if(bills[i]==20){
                if(c10>0){
                    c10--;
                    c5--;
                }
                else{
                    c5=c5-3;
                }    
           }
           if(c5<0){
                System.out.println("NO");
                return;
           }
    }
        // System.out.println(sum);
        if(c5>=0 && c10>=0){
            System.out.println("yes");
        }
    }
}
