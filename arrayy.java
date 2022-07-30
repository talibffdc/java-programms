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
        int[] nums= {4,5,5,6,9,7,8,4,1,2,6};
        FindMinAndMax(nums);
    }
    
}
