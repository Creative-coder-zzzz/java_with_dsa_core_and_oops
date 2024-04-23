
public class clearithbitalst {
    
    public static int  clearLastIthbit(int n, int i){
        int bitmask = (~(0)<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        clearLastIthbit(15, 2);
        System.out.println(clearLastIthbit(15,2));
    }
}
