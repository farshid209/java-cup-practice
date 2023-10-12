package practice3;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;
    private String nationalId;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name1){
       name =name1;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName1){
        lastName=lastName1;
    }

    public String getNationalId(){
        return  nationalId;
    }

    public void setNationalId(String nationalId1){
        nationalId=nationalId1;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age1){
        age=age1;
    }

    public String toString(){
        return "name: "+ name + " lastName: " + lastName + " nationalId: " + nationalId + " age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getNationalId(), person.getNationalId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNationalId());
    }
}
