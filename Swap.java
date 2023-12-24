public class Swap {
    public static void main(String[] args) {
      swap(23,56);
    }
    static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}