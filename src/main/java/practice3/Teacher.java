package practice3;

import java.util.List;
import java.util.Objects;

public class Teacher extends Person {
    private String courseTitle;
    private List<Student> students;

    public String getCourseTitle(){
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle1){
        courseTitle=courseTitle1;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void setStudents(List<Student> students1){
        students=students1;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "\ncourseTitle='" + courseTitle + '\'' +
                "\nstudents=" + students +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getCourseTitle(), teacher.getCourseTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCourseTitle());
    }
}
