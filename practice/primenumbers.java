public class primenumbers{
    public static boolean checkprime(int n){
        if(n==1){
            return true;
        }
        if(n==2){
            return true;
        }
        if(n==0){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            
            if(n%i == 0){
                return false;
            }
           
            
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkprime(3));
    }
}