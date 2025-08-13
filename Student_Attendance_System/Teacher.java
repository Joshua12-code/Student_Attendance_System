public class Teacher extends User {
    private String subjectSpecialization;

    public Teacher(int id, String name, String subjectSpecialization) {
        super(id, name);
        this.subjectSpecialization = subjectSpecialization;
    }

    public String getSubjectSpecialization() {
        return subjectSpecialization;
    }

    public void setSubjectSpecialization(String subjectSpecialization) {
        this.subjectSpecialization = subjectSpecialization;
    }
}
