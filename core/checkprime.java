
public class checkprime {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void checkprimeinrange(int n){
        for(int i = 1; i<n-1; i++){
            if(prime(i)==true){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        checkprimeinrange(10);
    }
}
