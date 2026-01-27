 /**
 * minMaxFinder
 *
 * Searches an int array for its minimum and maximum in two seperate methods
 * namely: maxFinder and minFinder
 * 
 *
 * @author Gökalp Özgen (22502784)
 * @version 27/01/2026 9:28
 */

  // Finds the minimum integer in an int array
 
public class minMaxFinder{
    public static int minFinder (int[] nums){
        int min = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    // Finds the maximum integer in an int array
    public static int maxFinder (int[] nums){
        int max = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}