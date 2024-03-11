import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,4,4,2,1};

        System.out.println(Arrays.toString(setmismatch(arr)));
    }
    static void cyclicsort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int correctindex=arr[i]-1;
            if (arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
        }
    }
    static int[] setmismatch(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int correctindex=arr[i]-1;
            if (arr[i]!=arr[correctindex]){
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]!=(i+1)){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
