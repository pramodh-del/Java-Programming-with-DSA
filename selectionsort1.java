import java.util.Arrays;

public class selectionsort1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        slectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void slectionsort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int last=arr.length-i-1;
            int max=max(arr,0,last);
            swap(arr,last,max);

        }
    }
    static int max(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
    static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
