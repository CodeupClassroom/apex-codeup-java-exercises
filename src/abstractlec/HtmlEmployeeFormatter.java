package abstractlec;

public class HtmlEmployeeFormatter implements Formatter {
    public String display(Employee employee) {
        return String.format(
                "<div class=\"user\"><h2>%s - (%s)</h2></div>",
                employee.getName(), employee.getDepartment()
        );
    }
}
