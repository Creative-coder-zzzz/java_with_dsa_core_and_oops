public class copyconstructors {
    
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Sandesh";
        s1.roll = "34";
        s1.marks[0] = 12;
        s1.marks[1] = 13;
        s1.marks[2] = 14;
        student s2 = new student(s1);
        s1.marks[2] = 39;
    
        s1.display();
        s2.display();
        
    }
}

class student{
    String name;
    String roll;
    int marks[] = new int[3];

//   student(student s1){
//     this.marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.marks = s1.marks;

//     }
student (student s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
 
    for(int i =0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
    }
}
    student(){
 
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}