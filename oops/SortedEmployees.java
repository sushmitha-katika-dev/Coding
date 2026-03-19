import java.util.Arrays;
import java.util.List;

public class SortedEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Anu", 3000),
            new Employee("Sushmitha", 2000),
            new Employee("Mani", 5000)
        );

        employees.sort((a, b) -> Double.compare(a.getSalary(), b.getSalary()));

        employees.forEach(System.out::println);
    }
}
