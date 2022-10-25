import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Simple calculator");

        System.out.println("\nThe available operations are: ");
        System.out.println("\n1. Add");
        System.out.println("\n2. Subtract");
        System.out.println("\n3. Multiply");
        System.out.println("\n4. Divide");
        System.out.println("\n5. Square");

        System.out.println("\nWhich operation would you like? (answer 1-5)");
        int choice = Integer.parseInt(userInput.next());
        System.out.println();

        if(choice == 1) {
            Add();
        } else if(choice == 2) {
            Subtract();
        } else if(choice == 3) {
            Multiply();
        } else if (choice == 4) {
            Division();
        } else if(choice == 5) {
            Square();
        }
        System.out.println();
        userInput.close();
    }

    private static void Add() {
        int num1;
        int num2;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Add");

        System.out.println("\nFirst number: ");
        num1 = userInput.nextInt();

        System.out.println("\nSecond number: ");
        num2 = userInput.nextInt();

        userInput.close();
        System.out.println("\nSum: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }

    private static void Subtract() {
        int num1;
        int num2;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Subtract");

        System.out.println("\nFirst number: ");
        num1 = userInput.nextInt();

        System.out.println("\nSecond number: ");
        num2 = userInput.nextInt();

        userInput.close();
        System.out.println("\nDifference: " + num1 + " - " + num2 + " = " + (num1 - num2));

    }

    private static void Multiply() {
        int num1;
        int num2;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Multiply");

        System.out.println("\nFirst number: ");
        num1 = userInput.nextInt();

        System.out.println("\nSecond number: ");
        num2 = userInput.nextInt();

        userInput.close();
        System.out.println("\nProduct: " + num1 + " * " + num2 + " = " + (num1 * num2));

    }

    private static void Division() {
        int num1;
        int num2;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Division");

        System.out.println("\nFirst number: ");
        num1 = userInput.nextInt();

        System.out.println("\nSecond number: ");
        num2 = userInput.nextInt();

        userInput.close();
        System.out.println("\nQuotient: " + num1 + " / " + num2 + " = " + (num1 / num2));

    }

    private static void Square() {
        int num1;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Square");

        System.out.println("\nFirst number: ");
        num1 = userInput.nextInt();

        userInput.close();
        System.out.println("\nSquare: " + num1 + " * " + num1 + " = " + (num1 * num1));

    }
}