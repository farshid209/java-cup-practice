package practice3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person= new Person();
        person.setName("farshid");
        person.setLastName("hoseinpour");
        person.setAge(29);
        person.setNationalId("00656789976");

        Person person1=new Person();
        person1.setNationalId("00656789976");
        person1.setName("elham");
        person1.setAge(24);
        person1.setLastName("sabori");

        if (person1.equals(person)){
            System.out.println("person1=person");
        }else {
            System.out.println("person1!= person");
        }

//        System.out.println(person);

        Student student=new Student();
        student.setEntranceYear(1400);
        student.setAverage(19.25);
        student.setUuid("0123456789");

//        System.out.println(student);

        Student student1=new Student();
        student1.setName("ehsan");
        student1.setLastName("rostaee");
        student1.setAge(32);
        student1.setNationalId("0098765432");
        student1.setEntranceYear(1396);
        student1.setUuid("1234567890");

//        System.out.println(student1);
        if (student.equals(student1)){
            System.out.println("student=student1");
        }else {
            System.out.println("student!=student1");
        }

        List<Student> studentList1= new ArrayList<>();
        studentList1.add(student);
        studentList1.add(student1);

        Teacher teacher= new Teacher();
        teacher.setCourseTitle(" math");
        teacher.setStudents(studentList1);

        Teacher teacher1=new Teacher();
        teacher1.setCourseTitle("history");
        teacher1.setStudents(studentList1);

        if (teacher.equals(teacher1)){
            System.out.println("teacher=teacher1");
        }else {
            System.out.println("teacher!=teacher1");
        }

//        System.out.println(teacher);

        List<Person> personList=new ArrayList<>();
        personList.add(person);
        personList.add(student);
        personList.add(teacher);
        personList.add(student1);
        personList.add(person1);
        personList.add(teacher1);

        for (Person p:personList) {
            System.out.println(p.toString());
        }


    }
}
