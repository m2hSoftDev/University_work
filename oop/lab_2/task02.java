import java.util.Arrays;

public class task02 {
    public static void main(String[] args) {
        int[] original = {5, 3, 9, 2, 1, 7};
        
        int[] reversed = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Reversed: " + Arrays.toString(reversed));
    }
}