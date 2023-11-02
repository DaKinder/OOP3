import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return Double.compare(employee2.getSalary(), employee1.getSalary());
    }
}


