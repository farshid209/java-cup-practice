package practice2;

import java.util.List;

public class Instructor extends Person{

    private double rank;
    private List<Student> supervisedStudents;

    public double getRank(){
        return rank;
    }

    public void setRank(double rank1){
        rank=rank1;
    }

    public List<Student> getSupervisedStudents(){
        return supervisedStudents;
    }

    public  void setSupervisedStudents(List<Student> supervisedStudents1){
        supervisedStudents=supervisedStudents1;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "rank=" + rank +
                ", supervisedStudents=" + supervisedStudents +
                '}';
    }
}
