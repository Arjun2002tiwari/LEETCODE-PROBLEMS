// https://leetcode.com/problems/di-string-match/
public class Leetcode36{
    public static void main(String[] args) {
        String s="IDID";
        int[] ar=new int[s.length()+1];
        int i=0;
        int d=s.length();
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='I'){
                ar[k]=i;
                i++;
            }
            else if(s.charAt(k)=='D'){
                ar[k]=d;
                d--;
            }
        }
        ar[s.length()]=i;
        for(int j=0;j<s.length()+1;j++){
            System.out.print(ar[j]+", ");
        }
    }
}