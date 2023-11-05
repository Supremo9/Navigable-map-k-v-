package com.mycompany.assignment1;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap1 {
    public static void main(String[] args) {
        // Creating a NavigableMap
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        // Adding elements to the navigable map
        navigableMap.put(3, "Three");
        navigableMap.put(1, "One");
        navigableMap.put(2, "Two");
        navigableMap.put(4, "Four");

        // Printing the elements of the navigable map
        System.out.println("Navigable Map: " + navigableMap);

        // Using various methods provided by the NavigableMap interface
        System.out.println("Ceiling entry for key 2: " + navigableMap.ceilingEntry(2));
        System.out.println("Floor entry for key 3: " + navigableMap.floorEntry(3));
        System.out.println("Higher entry for key 1: " + navigableMap.higherEntry(1));
        System.out.println("Lower entry for key 4: " + navigableMap.lowerEntry(4));

        // Using descending map
        NavigableMap<Integer, String> descendingMap = navigableMap.descendingMap();
        System.out.println("Descending Map: " + descendingMap);

        // Using subMap
        NavigableMap<Integer, String> subMap = navigableMap.subMap(2, true, 4, true);
        System.out.println("Sub Map: " + subMap);
    }
}


