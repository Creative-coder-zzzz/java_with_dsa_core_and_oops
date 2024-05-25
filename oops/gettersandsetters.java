public class gettersandsetters{
    public static void main(String[] args) {
        pen obj = new pen();
        obj.getcolor("Red");
        obj.gettip(0.005);
        obj.display();
    }
}
class pen {
    private String color;
    double tip;
    public void getcolor(String color){
        this.color = color;
    }
    public void gettip(double tip){
        this.tip = tip;
    }
    public void display(){
        System.out.println(this.color);
        System.out.println(this.tip);
    }
}