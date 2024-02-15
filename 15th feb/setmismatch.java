import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setmismatch {
    public static void main(String[] args) {
            int[] result={1,2,3,3,5};
        System.out.println(Arrays.toString(mismatch(result)));
    }
    static int[] mismatch(int[] arr){
        int n=arr.length;
        boolean[] result=new boolean[n+1];
        for (int num:arr){
            result[num]=true;
        }
        List<Integer>list=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (!result[i]){
                list.add(i);
            }

        }
        int[] result1=new int[2];
        int index=1;
        for (int num:list){
            result1[1]=num;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    result1[0]=arr[j];
                    break;
                }

            }

        }
        return result1;

    }
}
