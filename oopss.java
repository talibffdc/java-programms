
class Dog{
    String breed;
    String name;

    public void printInfo(){
        System.out.println(this.breed);
        System.out.println(this.name);
    }
}

public class oopss {
    public static void main(String[] args) {
        
        Dog d1= new Dog();
        d1.breed="Labra";
        d1.name="Puppi";
        d1.printInfo();
    }   
}
