public class repeated {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,4,3};
        int ans=arr(arr);
        System.out.println(ans);

    }
    static int arr(int[] arr){
        for (int num:arr){
            repeated(num);
        }
        return -1;
    }
    static int repeated(int n)
    {

        int rem=0;
        while(n>0)
        {
            rem=n%10;
            if (rem==1)
            {
                System.out.println(rem);
                return rem;
            }
            if (rem==3){
                System.out.println(rem);
                return rem;
            }
            n=n/10;
        }
        return -1;
    }
}
