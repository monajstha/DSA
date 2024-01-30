import java.util.LinkedList;

public class DSA_LinkedLists {
   public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

      // LinkedList = Stores Nodes (data + address) in two parts = data + address;

      //   linkedList.push("Apple");
      //   linkedList.push("Banana");
      //   linkedList.push("Citrus");
      //   System.out.println("Mimicks Stack");
      //   System.out.println(linkedList);
      //   System.out.println(linkedList.pop());

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("D");
        System.out.println("Mimicks Queue");

        System.out.println(linkedList);
        linkedList.add(2, "C");
        linkedList.remove("A");
        linkedList.addFirst("0"); //adds element to the first of the list
        linkedList.addLast("E"); //adds element to the first of the list
        linkedList.removeLast(); //removes element to the last of the list
        linkedList.removeFirst(); //removes element to the first of the list
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("C")); //similar to indexOf array method in js
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.poll()); //removes the last element of the list

   } 
}
