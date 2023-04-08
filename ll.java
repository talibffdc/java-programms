import java.util.LinkedList;

public class ll {

     public static void main(String [] args){

        LinkedList<Integer> list= new LinkedList<>();
        list.addFirst(8);
        list.addFirst(5);
        System.out.println(list);
        list.addLast(6);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("num. of node" + " "+ list.size());
        

    }
   

}


     