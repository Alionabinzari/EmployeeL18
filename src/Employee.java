import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private boolean isPayedPerHour;
    int age;

    public Employee(boolean isPayedPerHour, int age) {
        this.isPayedPerHour = isPayedPerHour;
        this.age = age;
    }

    public boolean isPazedPerHour() {
        return isPayedPerHour;
    }

    public void setPazedPerHour(boolean isPayedPerHour) {
        isPayedPerHour = isPayedPerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee() {
        super();
    }


    public boolean isPayedPerHour()
    {
        return  isPayedPerHour();
    }

    public Object getDepartment() {
        return getDepartment();
    }
}
