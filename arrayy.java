import java.util.Scanner;

public class arrayy {

    public static void FindMinAndMax(int[] nums){
        int max=nums[0];
        int min=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if (nums[i]< min){
                min=nums[i];
            }

        }
        System.out.println("The Minimum element is in the array" +" " + min);
        System.out.println("The maximum Element is in the array" +" " + max);
    }
     public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();

        int nums[]= new int[n];
        System.out.println(" Enter Elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        FindMinAndMax(nums);
    }
    
}
