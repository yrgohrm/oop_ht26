import java.util.*;

public class App {
    void main() {
        Set<Employee> employees = new HashSet<>(
                Set.of(
                        new Employee(1, "Lena", "Lamm", "executive", 104000),
                        new Employee(2, "Bosse", "Bredsladd", "dev", 56000),
                        new Employee(3, "Nisse", "Nilsson", "dev", 46000),
                        new Employee(4, "Lasse", "Larsson", "dev", 36000),
                        new Employee(5, "Leyla", "Iskander", "sales", 36000),
                        new Employee(6, "Owe", "Orm", "sales", 36000),
                        new Employee(7, "Mike", "Mikesson Sr.", "warehousing", 23000)));

        Map<String, Set<Employee>> departements = new TreeMap<>();
        Comparator<Employee> firstNameComp = Comparator.comparing(Employee::getFirstName);

        for (Employee employee : employees) {
            String departement = employee.getDepartement();

            // the fancy way to do it using a lambda function
            departements
                    .computeIfAbsent(departement, _ -> new TreeSet<>(firstNameComp))
                    .add(employee);

            // the easier to understand, but inefficient
            // var departementEmployees = departements.getOrDefault(departement, new
            // TreeSet<>(firstNameComp));
            // departementEmployees.add(employee);
            // departements.put(departement, departementEmployees);

            // the old school way to do it
            // Set<Employee> departementEmployees = departements.get(departement);
            // if (departementEmployees == null) {
            // departementEmployees = new TreeSet<>(firstNameComp);
            // departementEmployees.add(employee);
            // departements.put(departement, departementEmployees);
            // }
            // else {
            // departementEmployees.add(employee);
            // }
        }

        for (var entry : departements.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (var emp : entry.getValue()) {
                System.out.print(emp.getFirstName() + ",");
            }
            System.out.println();
        }

        // Employee e = new Employee(7, "Anton", "Andersson", "qa", 34000);
        // employees.add(e);

        // e.setEmployeeNumber(1);
        // e.setFirstName("Lena");
        // e.setLastName("Lamm");
        // e.setDepartement("executive");
        // e.setSalary(104000);

        // employees.remove(e);
        // employees.remove(e);

        // for (Employee employee : employees) {
        // System.out.println(employee);
        // }
    }
}
