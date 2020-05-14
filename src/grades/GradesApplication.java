package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student justin = new Student("Justin R");
        justin.addGrade(90);
        System.out.println(justin.getGradeAverage());
        System.out.println(justin.getGradeAverage() == 90);
        justin.addGrade(70);
        System.out.println(justin.getGradeAverage() == 80);

        Student sophie = new Student("Sophie K");
        sophie.addGrade(100);
        sophie.addGrade(50);

        Student vivian = new Student("Vivan C");
        vivian.addGrade(87);
        vivian.addGrade(99);

        students.put("jreich5", justin);
        students.putIfAbsent("sophiek", sophie);
        students.putIfAbsent("vivianc", vivian);

        cli(students);

    }

    public static void cli(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        do{

            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }

            System.out.println("What student would you like to see more information on?\n");
            String typedKey = input.getString();
            if(students.containsKey(typedKey)){

                Student currentStudent = students.get(typedKey);

                System.out.println(String.format("Name: %s - GitHub Username: %s\n"
                                + "Current Average: %.2f",
                        currentStudent.getName(),
                        typedKey,
                        currentStudent.getGradeAverage()
                        ));
            }else{
                System.out.println("Sorry, no student found with the GitHub username of "+ typedKey);
            }
            System.out.println("Would you like to see another student?");
        }while(input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");

    }

}
