package abstractlec;

public class Instructor extends Employee implements Formatter {
    public Instructor(String name, String department) {
        super(name, department);
    }

    public String work(){
        return "Instructing like instructors do.";
    }

    public String display(Employee employee) {
        return employee.getName() + " works in " + employee.getDepartment();
    }
}
