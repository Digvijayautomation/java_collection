package Set_Collections;

import java.util.HashSet;
// HashSet will not accept the duplicate values
// HashSet will accept null values
// Insertion order is not Preserved in HashSet
// It will accept the Heterogeneous values (string, int, null together)

public class hashset {

    public static void main(String[] args) {
         HashSet h=new HashSet();

         h.add("D");
         h.add("i");
         h.add("g");
         h.add("v");
         h.add("i");
         h.add("j");
         h.add("a");
         h.add("y");
         h.add(null);
         h.add("1992");


        System.out.println(h);
    }
}
