// Write a java program for getting different colors through ArrayList interface and sort them
// using Collections.sort( ArrayListObj)


import java.util.ArrayList;         // Importing ArrayList class
import java.util.Collections;       // Importing Collections class for sorting

public class SortColorList {
    public static void main(String[] args) {
        
        // Step 1: Create an ArrayList of type String to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Step 2: Add different color names to the ArrayList
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");

        // Step 3: Display the original list of colors
        System.out.println("Original color list:");
        System.out.println(colors);

        // Step 4: Sort the ArrayList in alphabetical order
        Collections.sort(colors); // This sorts the list in ascending (A-Z) order

        // Step 5: Display the sorted list of colors
        System.out.println("\nSorted color list:");
        System.out.println(colors);
    }
}
