public class constructoroverloading {
    
    public static void main(String[] args) {
        student s2 = new student(123);
        student s1 = new student("Sandesh"); 
        student s3 = new student();
    }
}
class student{
    private int roll;
    String name;
    public 
     student(String name){
        this.name = name;
        System.out.println("Name :"+ this.name);
     }
     student(int roll){
        this.roll = roll;
        System.out.println("Roll n0 : "+ this.roll);
     }
     student(){
        System.out.println("Constructor called for the following data");
     
     }
}