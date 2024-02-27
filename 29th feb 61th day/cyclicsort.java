import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("array before sorted"+ Arrays.toString(arr));
        cyclicsort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsort2(int[] arr) {

        for (int i = 0; i <arr.length ; i++) {
            int index=arr[i]-1;
            if (arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else {
                i++;
            }

        }
    }

}
