import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
    int[] arr={4,3,2,7,8,2,3,1};
        cyclicsort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicsort1(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int index=arr[i]-1;
            if (arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }

        }
    }
}
