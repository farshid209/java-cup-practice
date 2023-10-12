package practice2;

public class Student extends Person {

    private double average;
    private int entranceYear;

    public double getAverage() {
        return average;
    }

    public void setAverage(double average1) {
        average = average1;
    }

    public int getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(int entranceYear1) {
        entranceYear = entranceYear1;
    }

    @Override
    public String toString() {
        return "Student{" +
                " name: " + getName() +
                ", phone number: " + getPhoneNumber() +
                ", average: " + average +
                ", entranceYear: " + entranceYear + "}";
    }
}
