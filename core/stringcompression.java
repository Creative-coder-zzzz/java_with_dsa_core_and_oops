
public class stringcompression {
    
    public static String compress(String san){
        String newstr = "";
        for(int i=0; i<san.length(); i++){
            Integer count = 1;
            while(i<san.length()-1 && san.charAt(i)==san.charAt(i+1)){
                count++;
                i++;
            }
            newstr += san.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
            
        }
        return newstr;
    }
    public static void main(String[] args) {
        String san = "aaabbcccdde";
        compress(san);
        System.out.println(compress(san));
    }
}
