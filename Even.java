import java.util.Scanner;
public class Even {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int num1=input.nextInt();
        if(num1%2==0){
            System.out.println("given number is even :"+num1);
        }
        else{
            System.out.println("given number is odd :"+num1);
        }
    }
}
