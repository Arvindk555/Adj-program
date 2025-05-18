// 6. Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index.


import java.util.ArrayList;    // Importing ArrayList class
import java.util.Scanner;      // Importing Scanner class for user input

public class RemoveNthColor {
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

        // Step 4: Take 'n' as input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the position (n) of the element to delete (starting from 1): ");
        int n = scanner.nextInt();

        // Step 5: Check if 'n' is valid and remove the (n-1)th index
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1);  // Convert to zero-based index
            System.out.println("\nColor at position " + n + " has been removed.");
        } else {
            System.out.println("\nInvalid position! No color was removed.");
        }

        // Step 6: Display the updated color list
        System.out.println("\nUpdated color list:");
        System.out.println(colors);

        scanner.close();  // Closing the scanner
    }
}
