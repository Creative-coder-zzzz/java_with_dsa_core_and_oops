
public class casetoup {

    public static String Change(String change){
        StringBuilder sb  = new StringBuilder("");
        char ch = Character.toUpperCase(change.charAt(0));
        sb.append(ch);
        for(int i = 1; i<change.length(); i++){
            if(change.charAt(i)==' '){
                sb.append(change.charAt(i));
                i++;
                sb.append(Character.toUpperCase(change.charAt(i)));
            }else{
                sb.append(change.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
      String change = "hi i am sandesh adhikari";
        System.out.println(Change(change));
    }
}
