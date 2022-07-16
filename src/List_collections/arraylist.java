package List_collections;

import java.util.ArrayList;

public class arraylist {

    // arraylist will  accept the duplicate values
// arraylist will accept null values
// Insertion order is  Preserved in arraylist
// It will accept the Heterogeneous values (string, int, null together)
// Best choice to use when our frequent operation is retrieval of data

    public static void main(String[] args) {

        ArrayList alist=new ArrayList();
        alist.add("10");
        alist.add("Digvijay");
        alist.add("Tikka");
        alist.add("1992");
        alist.add(null);

        System.out.println("Elements in ArrayList are "+alist);

        alist.remove(4);

        System.out.println("Elements in ArrayList After Removing 4th Index are "+alist);

        alist.add(1,"Im Newly Added");
        System.out.println("Elements in ArrayList After Replacing Element at 1st Adding New element at 2nd Index are "+alist);




    }
}
