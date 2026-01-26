import java.util.Random;

public class ArrayCreator {
    public int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        return arr;
    }
}
