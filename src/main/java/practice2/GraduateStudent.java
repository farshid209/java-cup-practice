package practice2;

public class GraduateStudent extends Student {

    private String thesisTitle;
    private Instructor supervisor;

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle1) {
        thesisTitle = thesisTitle1;
    }

    public Instructor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Instructor supervisor1) {
        supervisor = supervisor1;
    }

    @Override
    public String toString() {
        return "Graduate Student{thesis title: " + thesisTitle + ", supervisor: " + supervisor + "}";
    }
}
