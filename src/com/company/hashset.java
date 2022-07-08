package com.company;

import java.util.HashSet;
// HashSet will not accept the duplicate values
// HashSet will accept null values
// Insertion order is not Preserved in HashSet
// It will accept the Heterogeneous values (string, int, null together)

public class hashset {

    public static void main(String[] args) {
         HashSet h=new HashSet();

         h.add("A");
         h.add("B");
         h.add(10);
         h.add("B");
         h.add(null);


        System.out.println(h);
    }
}
