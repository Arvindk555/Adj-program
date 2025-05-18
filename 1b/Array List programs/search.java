// 1. Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not.


import java.util.ArrayList; // Importing the ArrayList class
import java.util.Scanner;   // Importing Scanner class for user input (optional)

public class ColorSearch {
    public static void main(String[] args) {
        
        // Create an ArrayList of type String to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors to the ArrayList
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Purple");

        // Display the list of colors
        System.out.println("Available colors in the list:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Check if "Red" is present in the list using contains() method
        if (colors.contains("Red")) {
            System.out.println("\nThe color 'Red' is available in the list.");
        } else {
            System.out.println("\nThe color 'Red' is NOT available in the list.");
        }
    }
}
