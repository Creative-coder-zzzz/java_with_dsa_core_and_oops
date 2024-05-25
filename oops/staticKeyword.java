public class staticKeyword {
    
    public static void main(String[] args) {
        A obj1 = new A();
       
        A obj2 = new A();
        
        A obj3 = new A();
       

        System.out.println(obj3.count);
    }
}

class A{
    public static int count = 0;
    A(){
        this.count = this.count+ 1;
    }
}