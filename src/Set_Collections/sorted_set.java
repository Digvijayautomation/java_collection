package Set_Collections;

import java.util.SortedSet;
import java.util.TreeSet;
// SortedSet will not accept the duplicate values
// SortedSet will accept null values
// Insertion order is not Preserved in SortedSet in defined sortting order
// It will accept only Homogeneous values (only string, or only int)

// SortedSet also have some extra methods like first(), last(), headset(),tailset();
// Default sorting order for numbers is smallest to largest and for char it is alphabatically

public class sorted_set {

    public static void main(String[] args) {

        SortedSet set= new TreeSet();

        set.add(34);
        set.add(4);
        set.add(2);
        set.add(5);
        set.add(9);


        System.out.println("The list of elements is given as:");
        for (Object object : set) {
            System.out.println(object);
        }

        System.out.println("First Element in List is"+set.first());
        System.out.println("Last Element in List is"+set.last());
        System.out.println(" Headset of 3rd element is "+set.headSet(2));
        System.out.println("Tail-set of 4th Element is"+set.tailSet(5));
        System.out.println(set.comparator()); // Returns the sorting technique if used otherwise return null because default sorting technique is used

    }

}
