package practice2;

public class Person {

    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber1) {
        phoneNumber = phoneNumber1;
    }

    @Override
    public String toString() {
        return "Person{" + " name: " + name + ", phone number: " + phoneNumber + "}";
    }
}
