import java.util.*;

public class EmpMain {
    void main() {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        boolean shouldContinue = true;
        while (shouldContinue) {
            displayMainMenu();

            String choice = scanner.nextLine();

            switch (choice.strip()) {
                case "1" -> registerEmployee(scanner, employees);
                case "2" -> searchSalary(scanner, employees);
                case "3" -> {

                }
                default -> {
                    shouldContinue = false;
                }
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("SUPER COOL EMPLOYEE PROGRAM");
        System.out.println();
        System.out.println("Select an option:");
        System.out.println("1. Register employee");
        System.out.println("2. Search salary");
        System.out.println("3. Search name");
        System.out.println("4. Exit");
    }

    private void searchSalary(Scanner scanner, List<Employee> employees) {
        System.out.println("Enter lower salary range");
        String lowerString = scanner.nextLine();

        System.out.println("Enter upper salary range");
        String upperString = scanner.nextLine();

        int lower = Integer.parseInt(lowerString);
        int upper = Integer.parseInt(upperString);

        for (Employee employee : employees) {
            int salary = employee.getSalary();
            if (salary >= lower && salary <= upper) {
                System.out.println(employee.getName());
            }
        }
    }

    private void registerEmployee(Scanner scanner, List<Employee> employees) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter salary:");
        String salaryString = scanner.nextLine();

        Employee emp = new Employee(name, Integer.parseInt(salaryString));
        employees.add(emp);
    }
}
