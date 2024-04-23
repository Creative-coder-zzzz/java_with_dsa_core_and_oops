
public class stringsubarray {
 
    public static String sub(String s1,int si, int ei){
        String substr = "";
        for(int i = si; i<ei; i++ ){
            substr += s1.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String s1 = "Hello world";
        
        System.out.println(s1.substring(0 , 5));
        System.out.println(sub(s1, 0, 5));

    }
}
