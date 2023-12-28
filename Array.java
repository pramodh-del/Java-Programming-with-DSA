import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // declared a array
       int[] rollno=new int[5];
        for (int i = 0; i < rollno.length; i++)
        {
           rollno[i]=s.nextInt();
        }
        //method 1
//        for (int i = 0; i < rollno.length ; i++)
//        {
//            System.out.print(rollno[i]+" ");
//        }
        //method 2
        System.out.println(Arrays.toString(rollno));


        //method 2
        for (int num:rollno){
            System.out.println(rollno[num]);
        }
    }
}