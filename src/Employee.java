import java.util.Arrays;

public class Employee {
    private boolean isPazedPerHour;
    int age;

    public Employee(boolean isPazedPerHour, int age) {
        this.isPazedPerHour = isPazedPerHour;
        this.age = age;
    }

    List<Employee> employeeList = Arrays.asList();
    employeeList.stream().filter(e->e.getAge()>25 &&e.isPayedPerHour() &&
    e.isPayedPerHour() e.getDepartment ().equals ("Management")).distinct () .limit(5) .forEach(System.out::println);

}
