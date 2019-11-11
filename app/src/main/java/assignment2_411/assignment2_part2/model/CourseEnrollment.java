package assignment2_411.assignment2_part2.model;

public class CourseEnrollment {
    protected String mCourseID;
    protected String mGrade;

    public CourseEnrollment(String _mCourseID, String _mGrade) {
        mCourseID = _mCourseID;
        mGrade = _mGrade;
    }

    public String getmCourseID() {
        return mCourseID;
    }

    public void setmCourseID(String _mCourseID) {mCourseID = _mCourseID;}

    public String getmGrade() {
        return mGrade;
    }

    public void setmGrade(String _mGrade) {
        mGrade = _mGrade;
    }

}
