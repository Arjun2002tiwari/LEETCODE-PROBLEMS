// https://leetcode.com/problems/watering-plants-ii/
public class Leetcode67 {
    public static void main(String[] args) {
    int[] plants={2,1,1};
    int capacityA=2,capacityB=2;
    int a=capacityA,b=capacityB;
    int start=0,end=plants.length-1;
    int count=0;
    while(start<=end){
        if(start==end){
            if(plants[start]>capacityA && plants[end]>capacityB){
                count=count+1;
            }
            start++;
        }
        else{
           if(plants[start]>capacityA){
            capacityA=a;
            count+=1;
           }
           if(plants[end]>capacityB){
            capacityB=b;
            count+=1;
           }
            capacityA=capacityA-plants[start];
            capacityB=capacityB-plants[end];
            start++;
            end--;
        }
    }
    System.out.println(count);
    }
}
