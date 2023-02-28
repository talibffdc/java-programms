public class minandmaxx {

    public static void main(String[] args) {
        int arr[] ={1, 2, 4, 6, 8, 46};
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        

        for (int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("the min element is "+""+min);

        for (int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
         
       
        System.out.println("the max element is "+""+max);
    }
    
}
