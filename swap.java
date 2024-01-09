public class swap {
    public static void main(String[] args)
    {
        swap(23,24);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("values are "+a+" " + b);

    }
}
