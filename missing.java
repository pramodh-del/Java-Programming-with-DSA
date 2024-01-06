public class missing {
    public static void main(String[] args) {
        int n=10;
        int sum1=n*(n+1)/2;
        int[] arr={1,2,3,4,5,6,7,9,10};
        int sum2=0;
        for (int i = 0; i < arr.length; i++)
        {
            sum2+=arr[i];
        }
        int missing=sum1-sum2;
        System.out.println(missing);
    }
}
