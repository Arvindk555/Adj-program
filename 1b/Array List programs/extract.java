// 5. Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()


import java.util.ArrayList;   // Importing ArrayList class
import java.util.List;        // Importing List interface for subList()

public class SubListColorExample {
    public static void main(String[] args) {

        // Step 1: Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Step 2: Add different color names to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Step 3: Display the original list of colors
        System.out.println("Original color list:");
        System.out.println(colors);

        // Step 4: Use subList() to extract 1st and 2nd elements (index 0 to 2 exclusive)
        List<String> subColors = colors.subList(0, 2); // Gets elements at index 0 and 1

        // Step 5: Display the extracted sublist
        System.out.println("\nExtracted sublist (1st and 2nd elements):");
        System.out.println(subColors);
    }
}
