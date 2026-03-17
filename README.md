# Programming Fundamentals Project: Prime Number Checker

This Java application is a robust solution to determine if a specific integer is a **prime number**. It was developed as a solution for **Problem 8, Unit 1** of the Programming Fundamentals course.

## 🚀 How it Works
The program implements an efficient **primality test algorithm** with the following logic:
* **Edge Case Handling:** Any number less than 2 is immediately identified as *not prime*.
* **Mathematical Optimization:** Instead of checking every number up to $n$, the loop only iterates while $divisor^2 \leq n$. This significantly improves performance for larger numbers.
* **Flag Logic:** It uses a boolean flag (`foundDivisor`) to stop the loop as soon as a factor is found, preventing unnecessary calculations.

## 🛠️ Technical Features
* **Scanner Implementation:** Utilizes `java.util.Scanner` for interactive user input.
* **Input Validation:** Includes a robust check (`scanner.hasNextInt()`) to ensure the program only processes valid integers.
* **Clean Code:** The logic is separated into a dedicated method `verifyIfPrime(int n)` to ensure readability and reusability.

## 💻 Usage
1. **Compile the program:**
   ```bash
   javac PrimeChecker.java
