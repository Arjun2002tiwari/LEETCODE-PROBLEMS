import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode53 {
    public static void main(String[] args) {
        String s= "hi(name)";
        List<List<String>> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        list1.add("name");
        list1.add("bob");
        list.add(list1);
        String res="";
        res+=s;
        HashMap<String,String> map=new HashMap<>();
        for(List<String> k:list){
            map.put(k.get(0),k.get(1));
        }
        int i=s.indexOf("(");
        while(i!=-1){
            int j=s.indexOf(")",i);
            String key=s.substring(i+1,j);
            if(map.containsKey(key)){
                res=res.replace("("+key+")",map.get(key));
            }else{
                res=res.replace("("+key+")","?");
            }
            i=s.indexOf("(",j);

        }
        System.out.println(res);
    }
}
