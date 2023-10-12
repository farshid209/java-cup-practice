package practice3;

import java.util.Objects;

public class Student extends Person {
    private int entranceYear;
    private double average;
    private String uuid;

    public int getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(int entranceYear1) {
        entranceYear = entranceYear1;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid1) {
        uuid = uuid1;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average1) {
        average = average1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "entranceYear=" + entranceYear +
                ", average=" + average +
                ", uuid='" + uuid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getEntranceYear() == student.getEntranceYear() && Double.compare(student.getAverage(), getAverage()) == 0 && Objects.equals(getUuid(), student.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEntranceYear(), getAverage(), getUuid());
    }
}
