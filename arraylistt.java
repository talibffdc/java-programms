import java.util.*;
import java.util.Collection;

public class arraylistt {

    public static void main(String[] args) {
        
        ArrayList <Integer> list= new ArrayList <Integer>();
        
        // add a element in a list

        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(6);
         System.out.println(list);

         // add element in between

         list.add(0, 4);
         System.out.println(list);

         // get a element

       int element= list.get(2);
         System.out.println(element);

         // set elemt 

         list.set(1,9);
         System.out.println(list);


         //delete a element 
         list.remove(3);
         System.out.println(list);


         // size of array
         int size= list.size();
         System.out.println(size);


         // loop on array

         for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
         }
        System.out.println();
         
         
         // sort the array 
        
         Collections.sort(list);
         System.out.println(list);
    }
    
}