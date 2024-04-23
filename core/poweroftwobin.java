
public class poweroftwobin {
    
    public static boolean check(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        check(8);
        System.out.println(check(9));
    }
}

