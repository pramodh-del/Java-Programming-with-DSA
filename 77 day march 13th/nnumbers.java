public class nnumbers {
    public static void main(String[] args) {
        nnumbers(10);
    }
    static int sum(int n){
        int nsum=n*(n+1)/2;
        return nsum;
    }
    static int sumofdigits(int n){
        if (n==0){
            return 0;
        }
        return n%10+sumofdigits(n/10);
    }
    static void nnumbers(int n){
        if (n<=1){
            System.out.print(1+" ");
            return;
        }
        nnumbers(n-1);
        System.out.print(n+" ");


    }
}
