
public class StringCheckPalindrome {
    
 
    public static boolean check(String key){
        int n = key.length();
        for(int i =0; i<key.length()/2; i++){

            if(key.charAt(i)== key.charAt(n-1-i)){
                return true;
                
            }
    
           
        
    }
     
        return false;
    }
    public static void main(String[] args) {
        String key ="madam";
        check(key);
        System.out.println(check(key));
    }
}
