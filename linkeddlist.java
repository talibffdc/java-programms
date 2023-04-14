public class linkeddlist {
   Node head;
   class Node{
    String data;
    Node next;

    Node (String data){
        this.data=data;
        this.next=null;

    }
   }

   public void addFirst(String data) {

    Node newNode = new Node(data);

    newNode.next = head;

    head = newNode;


}

public void printList() {

    Node currNode = head;


    while(currNode != null) {

        System.out.print(currNode.data+" -> ");

        currNode = currNode.next;

    }


    System.out.println("null");

}


   public static void main(String[] args) {
    linkeddlist list= new linkeddlist();

    list.addFirst("a");
    list.addFirst("cat");

    list.printList();
   
   }
    
}
