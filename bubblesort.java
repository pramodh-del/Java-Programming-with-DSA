import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={2,7,4,7};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length-i-1; j++)
            {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }

        }
    }
}
