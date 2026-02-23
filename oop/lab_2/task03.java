import java.util.Arrays;
public class task03 {

    public static void main(String[] args) {
        int[] input = {1, 1, 2, 2, 3, 4, 5, 5};

        if (input.length == 0) return;

        int uniqueCount = 1;
        for (int j = 1; j < input.length; j++) {
            if (input[j] != input[uniqueCount - 1]) {
                input[uniqueCount] = input[j];
                uniqueCount++;
            }
        }
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = input[i];
        }

        System.out.println(Arrays.toString(result));
    }

}
