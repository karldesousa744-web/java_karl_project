import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("num1 is greater");
        } else if (b > a && b > c) {
            System.out.println("num2 is greater");
        } else if (c > a && c > b) {
            System.out.println("num3 is greater");
        } else {
            System.out.println("Two or more numbers are equal and greatest.");
        }

        sc.close();
    }
}
