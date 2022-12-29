import java.util.*;
public class Main {
    public static void main(String[] args) {
        BaseSalaryCalculator[] calc = {
                new SeniorSalaryCalculator(new DeveloperReport("Becki", "Senior Developer", 30.5, 160)),
                new JuniorSalaryCalculator(new DeveloperReport("Leo", "Junior Developer", 20, 150)),
                new SeniorSalaryCalculator(new DeveloperReport("MeM", "Senior Developer", 30.5, 180)),
                new SystemArchitectCalculator(new DeveloperReport("Schnorri", "System Architect", 30.5, 180))
        };

        ArrayList<BaseSalaryCalculator> calculators = new ArrayList<>(Arrays.asList(calc));

        SalaryCalculator calculator = new SalaryCalculator(calculators);
        System.out.println("Sum of all the developer salaries is " + calculator.calculateTotalSalaries() + " euros");
    }
}