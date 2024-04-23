
public class checkevenodd {
    
    public static void evenodd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
    public static void main(String[] args) {
        evenodd(3);
        evenodd(4);
        evenodd(5);
        evenodd(10);
    }
}
