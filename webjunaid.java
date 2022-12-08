import java.util.Scanner;

public class webjunaid {a
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int rows = scan.nextInt();
            int n = (rows/2) + 1;
            for (int i=1; i<=n; i++) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i)-1; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            for (int i=n-1; i>=1; i--) {
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                for(int j=1; j<=(2*i)-1; j++) {
                    System.out.print("$");
                }
                System.out.println();
            }
            for(int i=1; i<=rows+2; i++) {
                for(int j=1; j<=n; j++) {
                    if(j<n) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("@");
                    }
                }
                System.out.println();
            }
        }
    
    }
