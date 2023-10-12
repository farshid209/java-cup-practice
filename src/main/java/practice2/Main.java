package practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName("Farshid");
        person.setPhoneNumber("09128765432");

        Student student= new Student();
        student.setEntranceYear(1391);
        student.setAverage(17.75);
        student.setName("farshid");
        student.setPhoneNumber("09195087406");

        Student student1=new Student();
        student1.setAverage(16.25);
        student1.setEntranceYear(1392);
        student1.setName("Ehsan");
        student1.setPhoneNumber("09351234567");

        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);

        Instructor instructor=new Instructor();
        instructor.setRank(5.5);
        instructor.setSupervisedStudents(studentList);
        instructor.setName("pouya");
        instructor.setPhoneNumber("09123456789");


        GraduateStudent graduateStudent=new GraduateStudent();
        graduateStudent.setThesisTitle("sazeha");
        graduateStudent.setSupervisor(instructor);
        graduateStudent.setAverage(19.25);
        graduateStudent.setEntranceYear(1394);
        graduateStudent.setName("reza");
        graduateStudent.setPhoneNumber("09361234567");

        System.out.println(student);
        System.out.println(person);
        System.out.println(graduateStudent);
    }

}
