
public class upperstringcase{
    public static String caseup(String san){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(san.charAt(0));
        sb.append(ch);
        for(int i = 1; i<san.length(); i++){
            if(san.charAt(i)==' '){
                sb.append(san.charAt(i));
                i++;
                sb.append(Character.toUpperCase(san.charAt(i)));
            }
            else{
            sb.append(san.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String san = "Hi i am sandesh";
        System.out.println(caseup(san));
    }
}