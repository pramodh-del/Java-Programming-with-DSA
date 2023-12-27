public class MinandMax {
    public static void main(String[] args) {
        Max(23,45,67);
        Min(34,56,78);
    }
    static void Max(int a,int b,int c) {
      int max=a;
      if (b>max){
          max=b;

      }
      if (c>max){
          max=c;

      }
        System.out.println("the max between to two numbers "+max);
    }
    static void Min(int a,int b,int c) {
        int min=a;
        if (b<min){
            min=b;

        }
        if (c<min){
            min=c;

        }
        System.out.println("the min between two numbers "+min);
    }
}
