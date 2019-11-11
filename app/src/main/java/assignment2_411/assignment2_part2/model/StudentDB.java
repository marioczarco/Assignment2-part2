package assignment2_411.assignment2_part2.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudentList;

    static public StudentDB getInstance() {
        return ourInstance;
    }

    public StudentDB() {
        createPersonObjects();
    }

    public ArrayList<Student> getStudentList() {
        return mStudentList;
    }

    public void setPersonList(ArrayList<Student> studentList) {
        mStudentList = studentList;
    }



    protected void createPersonObjects() {
        Student student = new Student("Felicity", " Auburn", 111111111);
        ArrayList<CourseEnrollment> courseEnrollments = new ArrayList<CourseEnrollment>();
        courseEnrollments.add(new CourseEnrollment("CPSC311", "A"));
        courseEnrollments.add(new CourseEnrollment("EGGN411", "C+"));
        student.setmCourseEnrollments(courseEnrollments);
        mStudentList = new ArrayList<Student>();
        mStudentList.add(student);

        student = new Student("Tristan", " Bluto", 111111112);
        courseEnrollments = new ArrayList<CourseEnrollment>();
        courseEnrollments.add(new CourseEnrollment("MATH511", "A+"));
        courseEnrollments.add(new CourseEnrollment("PHYS211", "B+"));
        student.setmCourseEnrollments(courseEnrollments);
        mStudentList.add(student);
    }
}
