public class recursion {
    public static void main(String[] args) {
        printhello(5);
    }
    static void printhello(int n){
        if (n<=0){
            //base conditiion
            return;
        }
        printhello(n-1);
        System.out.println("hello bhaiii");

    }
}
