package grades_app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        String userInput;
        boolean confirm = true;

        // Student 1
        Student hung = new Student("fer");
        hung.addGrade(88);
        hung.addGrade(98);
        hung.addGrade(79);
        hung.addGrade(100);
        // Student 2
        Student georgie = new Student("douglas");
        georgie.addGrade(100);
        georgie.addGrade(99);
        georgie.addGrade(100);
        georgie.addGrade(100);
        // Student 3
        Student guts = new Student("ryan");
        guts.addGrade(94);
        guts.addGrade(90);
        guts.addGrade(100);
        guts.addGrade(92);
        // Student 4
        Student supersmartguy = new Student("sophie");
        supersmartguy.addGrade(30);
        supersmartguy.addGrade(67);
        supersmartguy.addGrade(80);
        supersmartguy.addGrade(10);
        // Initializes HashMap
        students.put("gh_" + hung.getName(), hung);
        students.put("gh_" + georgie.getName(), georgie);
        students.put("gh_" + guts.getName(), guts);
        students.put("gh_" + supersmartguy.getName(), supersmartguy);
        // Records initial attendence
        hung.recordAttendance("2020-1-22", "P");
        hung.recordAttendance("2020-1-23", "P");
        hung.recordAttendance("2020-1-24", "P");
        guts.recordAttendance("2020-1-22", "A");
        guts.recordAttendance("2020-1-23", "A");
        guts.recordAttendance("2020-1-24", "P");
        georgie.recordAttendance("2020-1-22", "A");
        georgie.recordAttendance("2020-1-23", "P");
        georgie.recordAttendance("2020-1-24", "P");
        supersmartguy.recordAttendance("2020-1-22", "A");
        supersmartguy.recordAttendance("2020-1-23", "A");
        supersmartguy.recordAttendance("2020-1-24", "A");

        while (confirm) {
            confirm = startApp(students);
        }
    }

    public static boolean startApp(HashMap<String, Student> students) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        printPrompt(students);
        // Request username entry
        userInput = scanner.next();
        if (userInput.equalsIgnoreCase("all")) {
            printAllGrades(students);
        } else if (userInput.equalsIgnoreCase("overall")) {
            printOverall(students);
        } else if (userInput.equalsIgnoreCase("csv")) {
            printCSVReport(students);
        } else {
            printStudentData(students, userInput);
        }
        System.out.print("\nDo you want to see another student? Enter 'y': ");
        userInput = scanner.next();
        if (!userInput.equalsIgnoreCase("y")) {
            System.out.println("Exiting Application");
            return false;
        }
        return true;
    }

    public static void printPrompt(HashMap<String, Student> students) {
        System.out.println("Welcome!");
        System.out.println("\nHere is the list of the student's GitHub usernames:\n");
        int i = 1;
        System.out.print("|");
        for (String username : students.keySet()) {
            System.out.printf(" %d. %s |", i, username);
            i++;
        }
        System.out.println("\n\nWhat student would you like to see more information on? Enter username, 'all' for all grades, 'overall' for overall grade, or 'csv' for the CSV report: ");
    }

    public static void printAllGrades(HashMap<String, Student> students) {
        System.out.printf("%-25s %s\n", "Student Name", "Grades");
        for (Student student : students.values()) {
            System.out.printf("%-25s %s\n", student.getName(), student.getGrades());
        }
    }

    public static void printOverall(HashMap<String, Student> students) {
        double overallGrade = 0;
        for (Student student : students.values()) {
            overallGrade += student.getGradeAverage();
        }
        System.out.printf("The overall class grade is: %.2f", overallGrade / students.size());
    }

    public static void printStudentData(HashMap<String, Student> students, String gitHubUsername) {
        Student foundStudent;
        if (!students.containsKey(gitHubUsername)) {
            System.out.printf("Sorry, unable to find username of %s", gitHubUsername);
        } else {
            foundStudent = students.get(gitHubUsername);
            System.out.printf("Name: %s - GitHub username - %s\n"
                    + "Current Grade Average - %.2f\n", foundStudent.getName(), gitHubUsername, foundStudent.getGradeAverage());
            System.out.printf("List of grades: %s\n", foundStudent.getGrades());
            System.out.printf("List of Dates Absent: %s\n", foundStudent.getDaysAbsent());
            System.out.printf("Percentage of days attended: %.2f\n", foundStudent.calculateAttendance());
        }
    }

    public static void printCSVReport(HashMap<String, Student> students) {
        System.out.printf("%-24s | %-24s | %-24s\n", "name", "github username", "average");
        String[] usernames = new String[students.size()];
        int index = 0;
        for (String username : students.keySet()) {
            usernames[index] = username;
            index++;
        }
        index = 0;
        for (Student student : students.values()) {
            System.out.printf("%-24s | %-24s | %-24.2f\n", student.getName(), usernames[index], student.getGradeAverage());
            index++;
        }
    }
}