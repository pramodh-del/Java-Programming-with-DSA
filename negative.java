import java.util.Arrays;

public class negative {
    public static void main(String[] args) {
        int[]arr={1, -1, 3, 2, -7, -5, 11, 6};
        System.out.println(Arrays.toString(negatives(arr)));
    }
    static int[] negatives(int[] arr){
        int left= arr.length-1;//index;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]<0){
                int temp=arr[left];//temp=a
                arr[left]=arr[i];//a=b
                arr[i]=temp;//b=temp
                left--;
            }

        }
        return arr;
    }

}
