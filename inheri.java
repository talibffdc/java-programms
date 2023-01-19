
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area (int l, int h){
        System.out.println( 2/2*l*h);
    }

    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.area(5, 9);
        t1.area();

    
    }


}