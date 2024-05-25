public class printNforward_recursion {
    public static void  forward(int n ){
    if(n==1){
        System.out.println(1);
        return;
    }
   forward(n-1);
   System.out.println(n);
    }
    public static void main(String[] args) {
        forward(10);
    }
}
