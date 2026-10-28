import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Basic Data Types and Variables
        String greeting = "Hello, World!";
        int repetitions = 3;
        boolean isActive = true;

        System.out.println(greeting);

        // 2. Conditional Logic (If-Else)
        if (isActive) {
            System.out.println("The program is running active loops:");
        }

        // 3. Loops (For Loop)
        for (int i = 1; i <= repetitions; i++) {
            System.out.println("Iteration number: " + i);
        }

        // 4. Object Collections (ArrayList)
        List<String> frameworkList = new ArrayList<>();
        frameworkList.add("Spring Boot");
        frameworkList.add("Hibernate");
        frameworkList.add("Maven");

        System.out.println("\nIterating through a Java Collection:");
        for (String framework : frameworkList) {
            System.out.println("- " + framework);
        }

        // 5. Instantiating a Custom Object
        Calculator calc = new Calculator();
        int sum = calc.addNumbers(15, 25);
        System.out.println("\nResult from custom class method: " + sum);
    }
}

// 6. Simple Helper Class to demonstrate OOP concepts
class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }
}
