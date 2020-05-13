package abstractlec;

public class ConsoleEmployeeFormatter implements Formatter {
    public String display(Employee employee) {
        return "--------------------" +
                "\n  name:  " + employee.getName() +
                "\n  department: " + employee.getDepartment();
    }
}
