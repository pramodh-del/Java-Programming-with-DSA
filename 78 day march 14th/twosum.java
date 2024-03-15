import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twosum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 106;
        pairs(arr,target);
    }

    static void pairs(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();
        boolean found=false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    resultList.add(pair);
                    found=true;
                }
            }
        }
        if (found==true){
            System.out.println(resultList);
        }
        else {
            System.out.println("Pair not found");
        }
    }
}
