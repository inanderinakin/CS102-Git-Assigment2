
public class differenceFromAvg {

    public static int[] differenceFromAverage(int[] numbers){
        int avg = 0;
        int length = numbers.length;
        int[] answer = new int[length];
        // Add up all integers to find the sum
        for (int i = 0; i < length; i++) {
            avg += numbers[i];
        }
        // Divide the sum by integer count to find the average
        avg = avg/length;
        // Find the difference of all integers from the sum
        for (int i = 0; i < length; i++) {
            answer[i] = numbers[i] - avg;
        }
        return answer;
    }
}