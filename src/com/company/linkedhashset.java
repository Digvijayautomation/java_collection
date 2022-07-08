package com.company;

import java.util.LinkedHashSet;

// HashSet will not accept the duplicate values
// HashSet will accept null values
// Insertion order is  Preserved in HashSet
// It will accept the Heterogeneous values (string, int, null together)


public class linkedhashset {

    public static void main(String[] args) {


            LinkedHashSet lh=new LinkedHashSet();

        lh.add("A");
        lh.add("B");
        lh.add(10);
        lh.add("B");
        lh.add(null);


            System.out.println(lh);
        }

    }

