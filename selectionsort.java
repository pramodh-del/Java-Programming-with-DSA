import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));;
    }
    static void insertionsort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }

        }
    }
    static void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-i-1;
            int max=maxelement(arr,0,last);
            swap(arr,max,last);

        }
    }
    static int maxelement(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
