public class Sums{

    // calculates sum of numbers at even indexes and returns it
    public static int sumOfEvenIndexes(int[] numbers){

        // sum is 0 initially
        int sumOfEvenIndexes = 0;

        for (int i = 0; i < numbers.length; i++){   // loop goes on for 'size of array' times
            if (i % 2 == 0) {                       // checks if the index is divisible by 2 (if it is then the index is even)
                sumOfEvenIndexes += numbers[i];     // adds the number at that index to the sum of even indexes
            }
            }
        return sumOfEvenIndexes;
    }

    // calculates sum of numbers at odd indexes and returns it
    public static int sumOfOddIndexes(int[] numbers){

        // sum is 0 initially
        int sumOfOddIndexes = 0;

        for (int i = 0; i < numbers.length; i++){   // loop goes on for 'size of array' times
            if (i % 2 == 1) {                       // checks if the index is divisible by 2 (if it is not then the index is odd)
                sumOfOddIndexes += numbers[i];     // adds the number at that index to the sum of odd indexes
            }
        }
        return sumOfOddIndexes;
    }
}