
public class clearRangeofBits {
    public static int clearRange(int n, int i, int j){
int bitmask_a = ((~0)<<i);
int bitmask_b = (1<<i)-1;
int bitmask = bitmask_a | bitmask_b;
return n | bitmask;

    }
public static void main(String[] args) {
    clearRange(10, 2, 4);
    System.out.println(clearRange(10, 2, 4));
}


}
