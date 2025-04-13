// Calculator.java

public class Calculator {

    // Addition of two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction of two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication of two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division of two numbers
    public double divide(int a, int b) {
        return (double) a / b;
    }

    // Generate Fibonacci sequence up to n terms
    public int[] fibonacci(int n) {
        int[] sequence = new int[n];
        if (n > 0) sequence[0] = 0;
        if (n > 1) sequence[1] = 1;
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
        return sequence;
    }

    // Mean of an array
    public double mean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // Mode of an array
    public int mode(int[] array) {
        int maxCount = 0;
        int mode = array[0];

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        return mode;
    }

    // Square of a number
    public int square(int num) {
        return num * num;
    }

    // Cube of a number
    public int cube(int num) {
        return num * num * num;
    }

    // Square root of a number
    public double squareRoot(int num) {
        return Math.sqrt(num);
    }
}

