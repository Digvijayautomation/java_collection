package Set_Collections;

import java.util.LinkedHashSet;

// linkedHashSet will not accept the duplicate values
// linkedHashSet will accept null values
// Insertion order is  Preserved in linkedHashSet
// It will accept the Heterogeneous values (string, int, null together)

public class linkedhashset {

    public static void main(String[] args) {


            LinkedHashSet lh=new LinkedHashSet();

        lh.add("D");
        lh.add("i");
        lh.add("g");
        lh.add("v");
        lh.add("i");
        lh.add("j");
        lh.add("a");
        lh.add("y");
        lh.add(null);
        lh.add("1992");


            System.out.println(lh);
        }

    }

