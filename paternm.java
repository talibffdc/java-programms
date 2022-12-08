import java.util.Scanner;

public class paternm {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();
		int n = (rows/2) + 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=n+2; j++) {
				if(i<n) {
					System.out.print(" ");
				}
				else {
					System.out.print("@");
				}
			}
			for(int j=1; j<=rows; j++) {
				if(i==1||j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=(n-1); i>=1; i--) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=n+2; j++) {
//				if(i<n) {
					System.out.print(" ");
//				}
//				else {
//					System.out.print("@");
//				}
			}
			for(int j=1; j<=rows; j++) {
				if(i==1||j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
