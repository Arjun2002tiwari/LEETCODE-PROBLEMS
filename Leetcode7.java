// https://leetcode.com/problems/count-the-number-of-consistent-strings/

public class Leetcode7{
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        String allowed="abc";
        int sum=0;
        for(String s:words){
            int count=0;
            for(int i=0;i<s.length();i++){
                String str="";
                str+=s.charAt(i);
                if(allowed.contains(str)){
                    continue;
                }
                else{
                    count=1;
                    break;
                }
            }
            if(count==0){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}