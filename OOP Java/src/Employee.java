public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private Double salary;
    private String departmentName;
    public Employee(String name, int age, double salary, String departmentName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String setDepartmentName) {
        this.departmentName = setDepartmentName;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.departmentName.compareTo(employee.departmentName);
    }
    @Override
    public String toString() {
        return String.format("%s - %d - %.2f - %s\n", name, age, salary, departmentName);
    }
}
