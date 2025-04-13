// UserInput.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

    // Method to input two integers
    public int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        try {
            System.out.print("Enter the first number: ");
            numbers[0] = scanner.nextInt();
            System.out.print("Enter the second number: ");
            numbers[1] = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        }
        return numbers;
    }

    // Method to input an integer array
    public int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer values.");
                scanner.next(); // Clear the invalid input
                i--;
            }
        }
        return array;
    }

    // Menu-driven operation selector
    public void selectOperation() {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------ Java Calculator ------");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("5. Fibonacci Sequence\n6. Mean of Array\n7. Mode of Array");
        System.out.println("8. Square\n9. Cube\n10. Square Root");
        System.out.print("Enter your choice: ");

        try {
            int choice = scanner.nextInt();
            int[] numbers;
            switch (choice) {
                case 1:
                    numbers = inputNumbers();
                    System.out.println("Result: " + calculator.add(numbers[0], numbers[1]));
                    break;
                case 2:
                    numbers = inputNumbers();
                    System.out.println("Result: " + calculator.subtract(numbers[0], numbers[1]));
                    break;
                case 3:
                    numbers = inputNumbers();
                    System.out.println("Result: " + calculator.multiply(numbers[0], numbers[1]));
                    break;
                case 4:
                    numbers = inputNumbers();
                    try {
                        System.out.println("Result: " + calculator.divide(numbers[0], numbers[1]));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter number of Fibonacci terms: ");
                    int n = scanner.nextInt();
                    int[] fib = calculator.fibonacci(n);
                    System.out.print("Fibonacci: ");
                    for (int i : fib) System.out.print(i + " ");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Mean: " + calculator.mean(inputArray()));
                    break;
                case 7:
                    System.out.println("Mode: " + calculator.mode(inputArray()));
                    break;
                case 8:
                    System.out.print("Enter number: ");
                    System.out.println("Square: " + calculator.square(scanner.nextInt()));
                    break;
                case 9:
                    System.out.print("Enter number: ");
                    System.out.println("Cube: " + calculator.cube(scanner.nextInt()));
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    try {
                        System.out.println("Square Root: " + calculator.squareRoot(scanner.nextInt()));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}

