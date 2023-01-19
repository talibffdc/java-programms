import java.util.*;

public class arraypractice {
    public static void main(String[] args) {

        System.out.println("enter your size");
        
        Scanner sc= new Scanner (System.in);
        int size=sc.nextInt();

        System.out.println("enter your list");

        int [] number = new int [size];

        for(int i=0; i<size; i++){
            number[i]=sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }

    }


    
}
