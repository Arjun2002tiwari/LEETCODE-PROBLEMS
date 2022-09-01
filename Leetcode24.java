// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

public class Leetcode24 {
    public static void main(String[] args) {
        String[]  words = {"abc","car","ada","racecar","cool"};
        for(int i=0;i<words.length;i++){
            int count=0;
            for(int j=0;j<words[i].length()/2;j++){
                if(words[i].charAt(j)!=words[i].charAt(words[i].length()-1-j)){
                   count=1;
                   break; 
                }
            }
            if(count==0){
                System.out.println(words[i]);
                break;  
            }
        }
    }
}
