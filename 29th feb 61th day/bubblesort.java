import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("before sorting the array "+ Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean sort=false;
            for (int j = 1; j <arr.length ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sort=true;
                }

            }
            if (!sort){
                break;
            }
        }
    }
}
