import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={5,3,2,1};
        insersort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubblesort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastindex=arr.length-i-1;
            int maxelement=maxelement4(arr,0,lastindex);
            swapping(arr,maxelement,lastindex);

        }
    }

     static int maxelement4(int[] arr,int start,int end) {
        int max=start;
         for (int i = start; i <=end ; i++) {
             if (arr[max]<arr[i]){
                 max=i;
             }
         }
         return max;
    }
    static void swapping(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void insersort(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
