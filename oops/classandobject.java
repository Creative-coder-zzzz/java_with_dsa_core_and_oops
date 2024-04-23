
class pen{
    private
    int a, b;
    public
  
    int sum(int x , int y){
       a = x;
       b =y;
        return a+b;
    }
};
public class classandobject {
    public static void main(String[] args) {
        pen p1 = new pen();
   
        System.out.println(p1.sum(10,20));
    }
}
