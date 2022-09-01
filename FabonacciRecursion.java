public class FabonacciRecursion {
    static int fabonnaci(int i){
        if(i == 0){
            return 0;
        }
        else if(i == 1){
            return 1;
        }
        else{
            return fabonnaci(i-1) + fabonnaci(i-2);
            
        }
    }
    public static void main(String[] args) {
        int res=fabonnaci(4);
        // System.out.println(res);
    }
}
