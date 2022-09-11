import java.util.*;
public class practicefun {
    public static int CalculateSum(int a, int b){
        int multi = a * b;
        return multi;

    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int multi= CalculateSum(a,b);
       System.out.println(multi);

    }
    
}
