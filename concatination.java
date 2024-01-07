import java.util.Arrays;

public class concatination {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int[] ans=concation(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] concation(int[] nums){
       int length= nums.length;
       int[] ans=new int[2*length];
        for (int i = 0; i < ans.length ; i++) {
            ans[i]=nums[i+length];

        }
        return ans;
    }
}
