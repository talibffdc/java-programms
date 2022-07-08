import java.util.*;

public class exercixe3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the first Number: ");
        Double x=sc.nextDouble();
        
        System.out.print("Enter the Second Number: ");
        Double y=sc.nextDouble();

        System.out.print("Enter Third Number: ");
        Double z=sc.nextDouble();

        System.out.print("the Average num of " + average (x, y, z)+"\n");
}
public static double average(double x, double y, double z)
  {
    return (x + y + z) / 3;
  }
}
