import java.util.Arrays;

public class RearrangeNegatives {
    public static void main(String[] args) {
        int[] arr = {2, -4, 5, 1, -6, 3};
        reorder(arr);
        System.out.println(Arrays.toString(arr)); // Output: [2, 5, 1, 3, -4, -6]
    }

    static void reorder(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] >= 0) {
                left++;
            }
            while (left < right && arr[right] < 0) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }
}
