import java.util.LinkedList;

public class linkedlistt {
    public static void main(String[] args) {

        // there is use collections.

        LinkedList<String> list= new LinkedList<>();
        LinkedList<Integer> list1=new LinkedList<>();
        list.add("a");
        list.add("is");
        list.add("list");
        list.addFirst("this");
        list1.add(2);

        System.out.println(list);
        System.out.println(list1);
        


       // there is print of 0th index element.
       System.out.println(list.get(0));

       //  size finding
       System.out.println(list.size());
    }
}

 