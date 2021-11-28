import java.util.*;

public class conditional2 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
 if((a*100)>1000){
     System.out.println("you will get discount of" + (.1*a*100)+ " and your total cost is" + (a*100-(.1*a*100)));
    }
 else {
     System.out.println("no discount");
 }
}
}