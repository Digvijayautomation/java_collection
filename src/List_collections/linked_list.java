package List_collections;

import javax.management.MBeanAttributeInfo;
import java.util.LinkedList;

public class linked_list {

    // linked_list will  accept the duplicate values
// linked_list will accept null values
// Insertion order is  Preserved in linked_list
// It will accept the Heterogeneous values (string, int, null together)
// Best choice to use when our frequent operation is insertion in the middle of the list
    // Used in stack and queue


    public static void main(String[] args) {

        LinkedList Llist=new LinkedList();

        Llist.add("Digvijay");
        Llist.add("T");
        Llist.add("Tikka");
        Llist.add(12);
        Llist.add(10);
        Llist.add(1992);
        Llist.add(null);
        Llist.add(null);

        System.out.println(Llist);

        Llist.set(1,"Tukaram");
        System.out.println("LinkedList after replacing object at 1st Index"+Llist);

        Llist.addFirst("Introduction");
        System.out.println("LinkedList after Inserting element at Starting Index"+Llist);

        Llist.removeLast();
        System.out.println("LinkedList after Removing Last Object"+Llist);

        Llist.add(4,"Not NULL");

        System.out.println("LinkedList after Inserting  Object at 3rd Index"+Llist);
    }

}
