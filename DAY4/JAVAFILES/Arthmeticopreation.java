import java.util.Scanner;
public class Arthmeticopreation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstnumber = sc.nextInt();
        System.out.println("Enter Second number:");
        int secondnumber = sc.nextInt();
        System.out.println("Enter 1 for addition ");
        System.out.println("Enter 2 for subtraction ");
        System.out.println("Enter 3 for multiplication ");
        System.out.println("Enter 4 for division ");
        System.out.println("Enter 5 to Exit");
        int choice = sc.nextInt();
        if (choice == 1) {
            int add = firstnumber + secondnumber;
            System.out.println("Result" + " " + add);
        } else if (choice == 2) {
            int sub = firstnumber - secondnumber;
            System.out.println("Result" + " " + sub);
        } else if (choice == 3) {
            int mul = firstnumber * secondnumber;
            System.out.println(mul);
        } else if (choice == 4) {
            int division = firstnumber / secondnumber;
            System.out.println(division);
        } else {
            System.exit(0);
        }


    }
}
