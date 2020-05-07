package oop;

public class Cohort {

    static String companyName = "Codeup";

    private String name;
    private String startDate;
    public String endDate;
    private byte studentCount;
    public boolean graduated;

    public Cohort(String name, String startDate, byte studentCount){
        this.name = name;
        this.startDate = startDate;
        this.studentCount = studentCount;
    }

    protected void takeAttendance(){
        for(byte x = 1; x <= studentCount ;x++){
            System.out.println("Take attendance in "+this.name+": " + x);
        }
    }

}
