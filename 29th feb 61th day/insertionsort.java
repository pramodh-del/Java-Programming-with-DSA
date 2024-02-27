import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("array before insertion sort "+ Arrays.toString(arr));
        insertsort(arr);
        System.out.println(Arrays.toString(arr));
        String s="ababc";
        String sd="ac";
        Boolean s2=s.contains(sd);
        System.out.println(s2);
    }

    private static void insertsort(int[] arr) {
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
