public class Sums{

    public static void SumOfIndexes(){

        // both sums are 0 in the beginning
        int sumOfOddIndexes = 0;
        int sumOfEvenIndexes = 0;

        for (int i = 0; i < numbers.length; i++){   // loop goes on for 'size of array' times
            if (i % 2 == 0) {                       // checks if the index is divisible by 2 (if it is then the index is even)
                sumOfEvenIndexes += numbers[i];     // adds the number at that index to the sum of even indexes
            }else{                                  // if it is not then the index is odd
                sumOfOddIndexes += numbers[i];      // adds the number at that index to the sum of odd indexes
            }
        }

        System.out.println("Sum of even indexes: " + sumOfEvenIndexes);
        System.out.println("Sum of odd indexes: " + sumOfOddIndexes);
    }
}