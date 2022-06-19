// https://leetcode.com/problems/verifying-an-alien-dictionary/ 

public class Leetcode19 {
    public static void main(String[] args) {
        String words[]={"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        int seq=0;
        int[] mapping=new int[26];
        for(char ch:order.toCharArray()){
            mapping[ch-'a']=seq++;
        }
        for(int i=0;i<words.length-1;i++){
            String current=words[i];
            String next=words[i+1];

            int len=Math.min(current.length(),next.length());

            if(len!=current.length() && len==next.length() && current.startsWith(next)){
                System.out.println("false");
                break;
            }
            for(int k=0;k<len;k++){
                if(mapping[current.charAt(k)-'a']>mapping[next.charAt(k)-'a']){
                    System.out.println("false");
                    break;
                }
                if(mapping[current.charAt(k)-'a']<mapping[next.charAt(k)-'a']){
                    break;
                }
            }
        }
    }
}
