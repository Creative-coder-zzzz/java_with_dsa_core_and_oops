public class printNbackwards_recursion {
    
    public static void back(int n){
     if(n==1){
        System.out.println(1);
        return;
     }
     System.out.println(n);
     back(n-1);
     
    }
    public static void main(String[] args) {
        back(10);
    }
       
    }

