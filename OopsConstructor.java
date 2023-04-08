
// Constructor 
// class Student{
//     String name;
//     int age;
//     public void printinfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student (String name, int age){
//         this.name=name;
//         this.age=age;

//     }
    
// }


// public class OopsConstructor {

//     public static void main(String[] args) {
//         Student s1=new Student("aman", 26);
//         s1.printinfo();
//     }
    
    
// }


// copy Constructor 
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student (Student s2){
        this.name=s2.name;
        this.age=s2.age;

    }
    Student(){}
    
}


public class OopsConstructor {

    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="talib";
        s1.age=23;
        Student s2= new Student(s1);
        s2.printinfo();
    }
    
    
}
