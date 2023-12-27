import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int employeeid=sc.nextInt();
        String department=sc.next();
        switch (employeeid) {
            case 1 -> System.out.println("kunal");
            case 2 -> System.out.println("swathi");
            case 3 -> {
                System.out.println("pramodh");
                switch (department) {
                    case "it":
                        System.out.println("it department");
                        break;
                    case "book":
                        System.out.println("librian");
                        break;
                }
            }
        }
    }
}
