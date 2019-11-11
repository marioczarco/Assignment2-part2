package assignment2_411.assignment2_part2;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import assignment2_411.assignment2_part2.R;
import assignment2_411.assignment2_part2.model.Student;
import assignment2_411.assignment2_part2.model.CourseEnrollment;
import assignment2_411.assignment2_part2.model.StudentDB;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout _root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createPersonObjects();
        setContentView(R.layout.student_list);

        _root = (LinearLayout)findViewById(R.id.student_list);

        ArrayList<Student> studentList = StudentDB.getInstance().getStudentList();

        for (int i=0; i<studentList.size(); i++) {
            Student p = studentList.get(i);
            //
            LayoutInflater inflater = LayoutInflater.from(this);
            View row_view = inflater.inflate(R.layout.student_row, _root, false);
            //
            ((TextView) row_view.findViewById(R.id.first_name)).setText(p.getFirstName());
            ((TextView) row_view.findViewById(R.id.last_name)).setText(p.getLastName());
            //((TextView) row_view.findViewById(R.id.cwid)).setText(Integer.valueOf(p.getcwid()).toString());
            _root.addView(row_view);
        }

    }

    protected void createPersonObjects() {
        /*Student student = new Student("Felicity", "Auburn", 111111111);
        ArrayList<CourseEnrollment> courseEnrollments = new ArrayList<CourseEnrollment>();
        courseEnrollments.add(new CourseEnrollment("CPSC311", "A"));
        courseEnrollments.add(new CourseEnrollment("EGGN411", "C+"));
        student.setcourseEnrollments(courseEnrollments);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);

        student = new Student("Tristan", "Bluto", 111111111);
        courseEnrollments = new ArrayList<CourseEnrollment>();
        courseEnrollments.add(new CourseEnrollment("MATH511", "A+"));
        courseEnrollments.add(new CourseEnrollment("PHYS211", "B+"));
        student.setcourseEnrollments(courseEnrollments);
        students.add(student);

        StudentDB.getInstance().setPersonList(students);*/
    }
}
