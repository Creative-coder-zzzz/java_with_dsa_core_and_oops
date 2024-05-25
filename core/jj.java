public class jj {
    public static int factorial(int n){
        
      if(n==0){
        System.out.println(n);
        return -1;
      }
    
        n = n + factorial(n-1);
        return n;
    }
    
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
