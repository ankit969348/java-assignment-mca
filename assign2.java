import java.util.Arrays;

public class assign2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print whole array
        System.out.println("Array: " + Arrays.toString(arr));

        // Print elements individually
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}