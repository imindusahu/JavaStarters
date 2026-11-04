@FunctionalInterface
interface SalaryOperation {
    double calculate(double salary);
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        SalaryOperation bonus = salary -> salary * 0.10;

        SalaryOperation increment = salary -> salary * 0.15;

        SalaryOperation deduction = salary -> salary * 0.05;

        double salary = 50000;

        System.out.println("Bonus: " + bonus.calculate(salary));
        System.out.println("Increment: " + increment.calculate(salary));
        System.out.println("Deduction: " + deduction.calculate(salary));
    }
}