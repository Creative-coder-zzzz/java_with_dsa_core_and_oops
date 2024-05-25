public class methodoverriding {
    

    public static void main(String[] args) {
        
        deer deer1 = new deer();
    deer1.eat();
  

    }
}
class animal {
    void eat(){
        System.out.println("Eats anything");
    }
}

class deer extends animal{
    void eat(){
        System.out.println("Eats grass");
    }
}