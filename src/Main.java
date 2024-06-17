import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = 0.0;
        double height = 0.0;
        boolean validInput;

        do {
            System.out.print("Enter the width of your rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
            }
            if (width > 0) {
                validInput = true;
            } else {
                System.out.println("Please enter a number, or valid input. ");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        do {
            System.out.print("Please enter the height of your rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
            } if (height > 0) {
                validInput = true;
            } else {
                System.out.println("Please enter a number, or valid input. ");
                validInput = false;
                scanner.next();
            }
        } while (!validInput);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        System.out.println("The length of the diagonal for your rectangle is: " + diagonal);


    }
}