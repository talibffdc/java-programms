import java.util.*;

public class functionn {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer");
        int digit=sc.nextInt();
        System.out.println("the  sum is " + sumDigits(digit));
    }

    public static int sumDigits(long n){
    int result=0;
    while(n>0){
        result +=n%10;
        n/=10;
    }
    return result;

    }
}
