public class sortingg{


    public static void printNum(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
        // Bubble Sort
    public static void main(String[] args) {
        
        int arr[]= {2,4,1,3};

        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printNum(arr);
    }

}