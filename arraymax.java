public class arraymax{

    public static void main(String[] args){
        int[] a={4,100,6,9,55,1,3,9,2,5};
        int max=a[0];
        for(int i=1; i<a.length; i++){

            if(max<a[i]){
                max=a[i];
            }


        }
        System.out.println("Max"+ " " + max);

    }

}