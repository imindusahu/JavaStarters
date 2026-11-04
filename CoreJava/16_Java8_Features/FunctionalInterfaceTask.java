// ==========================================
// TASK 1 — GREETING INTERFACE
// ==========================================
@FunctionalInterface
interface Greeting {
    void greet();
}

// ==========================================
// TASK 2 — CALCULATOR INTERFACE
// ==========================================
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// ==========================================
// TASK 3 — DEFAULT AND STATIC METHODS
// ==========================================
@FunctionalInterface
interface Vehicle {
    // One abstract method
    void start();

    // Default method 1
    default void honk() {
        System.out.println("Vehicle is honking: Beep Beep!");
    }

    // Default method 2
    default void stop() {
        System.out.println("Vehicle has stopped safely.");
    }

    // Static method
    static void serviceCheck() {
        System.out.println("Static System Check: All vehicle diagnostics are green.");
    }
}

// ==========================================
// TASK 4 — EMPLOYEE SALARY OPERATIONS
// ==========================================
@FunctionalInterface
interface SalaryOperation {
    double apply(double salary);
}

// ==========================================
// MAIN TEST RUNNER
// ==========================================
public class FunctionalInterfaceTask {

    public static void main(String[] args) {
        
        // ------------------------------------------
        // Execution: Task 1 (Greeting)
        // ------------------------------------------
        System.out.println("\n======= TASK 1: Greeting Interface ========\n");
        Greeting welcomeMessage = () -> System.out.println("Welcome to the Java Functional Programming demonstration!\n");
        welcomeMessage.greet();

        // ------------------------------------------
        // Execution: Task 2 (Calculator)
        // ------------------------------------------
        System.out.println("\n====== TASK 2: Calculator Interface ======\n");
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        };

        System.out.println("Addition (10 + 5): " + addition.calculate(10, 5));
        System.out.println("Subtraction (10 - 5): " + subtraction.calculate(10, 5));
        System.out.println("Multiplication (10 * 5): " + multiplication.calculate(10, 5));
        System.out.println("Division (10 / 5): " + division.calculate(10, 5));
        System.out.println();

        // ------------------------------------------
        // Execution: Task 3 (Default & Static Methods)
        // ------------------------------------------
        System.out.println("\n===== TASK 3: Vehicle Default & Static Methods =====\n");
        // Test abstract method via lambda
        Vehicle myCar = () -> System.out.println("Vehicle abstract method: Car engine started roaring.");
        myCar.start();
        
        // Test default methods
        myCar.honk();
        myCar.stop();
        
        // Test static method directly from interface
        Vehicle.serviceCheck();
        System.out.println();

        // ------------------------------------------
        // Execution: Task 4 (Employee Salary Operations)
        // ------------------------------------------
        System.out.println("\n===== TASK 4: Employee Salary Operations =====\n");
        double baseSalary = 50000.0;
        
        SalaryOperation bonusCalc = salary -> salary * 0.10;
        SalaryOperation incrementCalc = salary -> salary * 0.15;
        SalaryOperation deductionCalc = salary -> salary * 0.05;

        double bonus = bonusCalc.apply(baseSalary);
        double increment = incrementCalc.apply(baseSalary);
        double deduction = deductionCalc.apply(baseSalary);
        double finalSalary = baseSalary + bonus + increment - deduction;

        System.out.println("Base Salary:        ₹" + baseSalary);
        System.out.println("10% Bonus:          ₹" + bonus);
        System.out.println("15% Increment:      ₹" + increment);
        System.out.println("5% Deduction:       ₹" + deduction);
        System.out.println("-----------------------------------");
        System.out.println("Final Net Salary:   ₹" + finalSalary);
    }
}
