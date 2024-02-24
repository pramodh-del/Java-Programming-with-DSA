import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={1,98,54,56,69,65};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort(int [] arr){
        for(int i=0;i<arr.length;i++){
           int correct=arr[i]-1;
           if (arr[i]!=arr[correct]){
               int temp=arr[i];
               arr[i]=arr[correct];
               arr[correct]=temp;
           }
           else {
               i++;
           }
        }
    }
}
//1,2,3,4,5,6