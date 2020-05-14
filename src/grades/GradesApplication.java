package grades;

public class GradesApplication {

    public static void main(String[] args) {
        Student justin = new Student("Justin");
        justin.addGrade(90);
        System.out.println(justin.getGradeAverage());
        System.out.println(justin.getGradeAverage() == 90);
        justin.addGrade(70);
        System.out.println(justin.getGradeAverage() == 80);


    }

}
