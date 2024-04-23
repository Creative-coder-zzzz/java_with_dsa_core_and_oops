
public class stringbuilder {
    
    public static void main(String[] args) {
        String ss = "tony";
        StringBuilder sb = new StringBuilder(ss);
        for(char s = 'a'; s<'z'; s++){
            sb.append(s);
        }
        System.out.println(sb);
    }
}
