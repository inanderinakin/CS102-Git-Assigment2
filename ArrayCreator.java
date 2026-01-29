import java.util.Random;

public class ArrayCreator {
    // This method creates an array with given size and fills it with random integers from 0 to 100 
    public static int[] createArray(int size) {
        // Creating the objects
        Random random = new Random();
        int[] arr = new int[size];

        // For every element in the array, replace it with a random integer from 0 to 100
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        return arr;
    }
}
