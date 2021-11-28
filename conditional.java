import java.util.*;

    public class conditional {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
    
        System.out.println("plz enetr A");
    int a=sc.nextInt();

        System.out.println("plz enter B");
    int b=sc.nextInt();

    if(a>b){
        System.out.println("a is biggest");
    }
        else
            if(a==b){
                System.out.println("a is equal to b");
            }
                else{
            System.out.println("a is smaller");
        }
    }
}
