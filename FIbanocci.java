public class FIbanocci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        int d=0;
        for (int i=0;i<n;i++){
            int c=a+b;
             c=c+b;
             d=d+c;
            System.out.println(d);

        }
    }
}
