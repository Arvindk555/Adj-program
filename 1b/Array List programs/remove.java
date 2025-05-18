// 2. Write a java program for getting different colors through ArrayList interface and remove the
// 2nd element and color "Blue" from the ArrayList.


import java.util.ArrayList; // Importing ArrayList class

public class RemoveColorExample {
    public static void main(String[] args) {
        
        // Step 1: Create an ArrayList of type String to store color names
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

        // Step 4: Remove the 2nd element (index 1, i.e., "Green")
        colors.remove(1);  // Indexing starts from 0

        // Step 5: Remove the color "Blue" by value
        colors.remove("Blue");

        // Step 6: Display the updated color list
        System.out.println("\nUpdated color list after removals:");
        System.out.println(colors);
    }
}
