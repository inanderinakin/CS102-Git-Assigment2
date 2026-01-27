import java.util.Arrays;
import java.util.Scanner;

/**
 * The Menu class manages the menu, inputs
 * and organizes the operations
 */
public class Menu {

    private Scanner scan;
    private static int arrSize = 10;
    private int[] array;
    private boolean isOver = false;

    public void runMenu() {
        // Initialize the scanner
        scan = new Scanner(System.in);

        // Create the array randomly with the given size
        array = ArrayCreator.createArray(arrSize);

        // Display the array
        System.out.printf("The array is generated: \n%s", Arrays.toString(array));

        // Display the menu until the app is over
        while (!isOver)
            displayMenu();

        scan.close();
    }

    private void displayMenu() {

        // The menu text
        System.out.println("\n\nPlease choose the operation. \nA number 1-5 or (e) for exit");
        System.out.println("-".repeat(45));
        System.out.println("1. Find the array minimum.");
        System.out.println("2. Find the array maximum.");
        System.out.println("3. Find the array average difference.");
        System.out.println("4. Find the array sum with odd-indexes.");
        System.out.println("5. Find the array sum with the even-indexes.");
        System.out.println("-".repeat(45));

        // Take the input of operation
        System.out.print("Operation: ");
        char operation = scan.next().charAt(0);

        // Execute the chosen operation
        if (operation == '1') {
            System.out.printf("The minimum of the array is: %d%n", minMaxFinder.minFinder(array));
        }
        if (operation == '2') {
            System.out.printf("The maximum of the array is: %d%n", minMaxFinder.maxFinder(array));
        }
        if (operation == '3') {
            System.out.printf("The average difference array is: %s%n",
                    Arrays.toString(differenceFromAvg.differenceFromAverage(array)));
        }
        if (operation == '4') {
            // TODO: implement here when the methods are provided.
        }
        if (operation == '5') {
            // TODO: implement here when the methods are provided.
        }
        if (operation == 'e') {
            System.out.println();
            System.out.println("-".repeat(45));
            System.out.println("The program has ended!");
            System.out.println("-".repeat(45));
            System.out.println();
            isOver = true;
        }
    }
}
