import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax of switch statement
        /*
        switch(expression){
        case:
        case:}
        alt+enter for more functionality
        * */
        String fruit=sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("national fruit");
            case "orange" -> System.out.println("big round fruit");
            case "grape" -> System.out.println("small fruit");
            default -> System.out.println("enter valid fruit");
        }
        ;
    }
}
