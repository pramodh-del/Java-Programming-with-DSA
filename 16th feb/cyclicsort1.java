import java.util.Arrays;

public class cyclicsort1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,1};
        int ans=cyclicsort(arr);
        System.out.println(ans);

    }
    static int cyclicsort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j]!=j){
                return j;
            }

        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
