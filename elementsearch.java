public class elementsearch {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9};
        int target=8;
        System.out.println("the give element is at index of "+search(arr,target));

    }
    static int search(int[] arr, int target){
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
