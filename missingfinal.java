import java.util.Scanner;

public class missingfinal {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,6,7};
//        int n= arr.length+1;
//        int sum=n*(n+1)/2;
//        for (int i = 0; i <arr.length ; i++)
//        {
//            sum=sum-arr[i];
//        }
//        System.out.println(sum);
        int ans=missing(arr,7);
        System.out.println(ans);

    }
    static int missing(int[] arr,int n){
        int sum=n*(n+1)/2;
        int sum2=0;
        for (int i = 0; i < arr.length ; i++) {
            sum2+=arr[i];
        }
        int ans=sum-sum2;
        return ans;
    }
}
