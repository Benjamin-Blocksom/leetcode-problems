// Create and use a linked list

import java.util.*;

public class LinkedListDemo {
  public static void main (String[]args) {
    LinkedList<String> linkedList = new LinkedList<String>();

    linkedList.add("e");
    linkedList.add("l");
    linkedList.add("l");
    linkedList.addFirst("H");
    linkedList.addLast("o");
    linkedList.add(1, "q");

    System.out.println(linkedList);

    linkedList.remove("q");

    System.out.println(linkedList);
  }
}
