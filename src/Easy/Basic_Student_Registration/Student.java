package Easy.Basic_Student_Registration;

public class Student {

    String name;
    int id;
    String course;
    int year;
    boolean honourStudent;

    Student(String name, int id, String course){
        this.name = name;
        this.id = id;
        this.course = course;
        this.year = 0;
        this.honourStudent = false;
    }

    Student(String name, int id, String course, int year){
        this.name = name;
        this.id = id;
        this.course = course;
        this.year = year;
        this.honourStudent = false;
    }

    Student(String name, int id, String course, int year, boolean honourStudent){
        this.name = name;
        this.id = id;
        this.course = course;
        this.year = year;
        this.honourStudent = honourStudent;
    }

    void displayInfo(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Id: " + this.id);
        System.out.println("Year: " + this.year);
        System.out.println("Course: " + this.course);
        System.out.println("Honour Student: " + this.honourStudent);
        System.out.println();
    }
}
