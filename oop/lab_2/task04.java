public class task04 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};
        
   
        int n = nums.length + 1; 

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}