import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 30};

        // Find the second largest element efficiently without sorting
        int largest = Integer.MIN_VALUE;  // Initialize largest as the smallest possible integer
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // Shift the current largest to second largest
                largest = num;            // Update the largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update the second largest only if it's not equal to the largest
            }
        }

        System.out.println("The second largest element is: " + secondLargest);
    }
}
