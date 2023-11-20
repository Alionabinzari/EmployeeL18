import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList  = Arrays.asList();

        employeeList.stream()
                .filter(e -> e.getAge()>25 &&
                             e.isPayedPerHour() &&
                             e.getDepartment().equals ("Management"))
                .distinct ()
                .limit(5)
                .forEach(System.out::println);

    }
}