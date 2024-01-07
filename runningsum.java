import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=nums(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] nums(int[] nums){
        int n=nums.length;
        int[] runningsum=new int[n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                runningsum[i]+=nums[j];

            }

        }
        return runningsum;

    }

}
