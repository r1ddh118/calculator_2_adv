# Java Calculator Application

A console-based calculator application written in Java that supports basic arithmetic operations, mathematical computations, and statistical functions. This project demonstrates clean object-oriented programming principles, exception handling, and modular design using separate Java files.

---

## Author Information
- **Name:** Riddhi Poddar  
- **PRN:** 23070126105  
- **Batch:** 2023–27 (B2 Batch)  

---

## Project Structure

| File Name        | Description                                      |
|------------------|--------------------------------------------------|
| `Main.java`      | Entry point for the application                  |
| `Calculator.java`| Contains all function definitions (logic)        |
| `UserInput.java` | Handles user input and function execution menu   |

---

## Features and Functionalities

Below are the available operations, each implemented as a separate function with proper exception handling:

### Arithmetic Operations

| Method               | Description                                  |
|----------------------|----------------------------------------------|
| `add(int, int)`      | Adds two integers                            |
| `subtract(int, int)` | Subtracts the second integer from the first  |
| `multiply(int, int)` | Multiplies two integers                      |
| `divide(int, int)`   | Divides two integers (handles division by zero) |

### Mathematical Computations

| Method                  | Description                                     |
|-------------------------|-------------------------------------------------|
| `square(int)`           | Calculates the square of an integer             |
| `cube(int)`             | Calculates the cube of an integer               |
| `squareRoot(int)`       | Calculates the square root (handles negative input) |
| `fibonacci(int)`        | Generates a Fibonacci series up to `n` terms    |

### Statistical Operations

| Method           | Description                                        |
|------------------|----------------------------------------------------|
| `mean(int[])`    | Calculates the average of array elements           |
| `mode(int[])`    | Finds the most frequently occurring element        |

---

## Exception Handling

| Exception Type           | Purpose                                      |
|---------------------------|----------------------------------------------|
| `InputMismatchException` | Handles invalid non-integer input from the user |
| `ArithmeticException`    | Catches division by zero and square root of negative numbers |

---
