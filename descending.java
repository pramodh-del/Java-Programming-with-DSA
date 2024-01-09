public class descending {
    public static void main(String[] args) {
        int[] arr={23,22,16,15,3,2,1};
        int target=23;
        int ans=searcharr(arr,target);
        System.out.println(ans);

    }

    static int searcharr(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start=mid+1;
            }
            else if (target>arr[mid])
            {
               end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
