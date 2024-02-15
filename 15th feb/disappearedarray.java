import java.util.ArrayList;
import java.util.List;

public class disappearedarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,9,2,6};
        List<Integer> ans=disapearedarray(arr);
        System.out.println(ans);

    }
    static List<Integer> disapearedarray(int[] arr){
        int n=arr.length;
        boolean[] result=new boolean[n+1];
        int index=0;
        for (int num:arr){
            result[num]=true;
        }
        List<Integer>list=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            if (!result[i]){
                list.add(i);
            }

        }
        return list;
    }
}
