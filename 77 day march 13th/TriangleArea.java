import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates of points B and C
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Input x-coordinate of point A and the desired area
        int x1 = scanner.nextInt();
        int k = scanner.nextInt();

        // Calculate the base of the triangle
        int base = x3 - x2;

        // Calculate the height of the triangle (distance from B to A)
        int height = Math.abs(x1 - x2);

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Calculate the minimum y-coordinate of point A
        int y1 = (int) Math.ceil(2 * area / base) + y2;

        // Ensure y1 > y2
        if (y1 <= y2) {
            y1 = y2 + 1;
        }

        // Output the result
        System.out.println(y1);
    }
}
