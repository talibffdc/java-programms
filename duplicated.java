import java.util.HashSet;

public class duplicated {

    public static void main(String [] args){
        HashSet<Integer> set=new HashSet<>();
        int [] arr={1,2,3,4,5,6,2,5,4};

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

       
            System.out.println(set);   
    }  
}
