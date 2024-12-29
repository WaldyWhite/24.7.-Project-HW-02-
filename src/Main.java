public class Main {
    public static void main(String[] args) {
        University university = new University("U001", "Technical University", "TechUni", 1965, StudyProfile.ENGINEERING);
        Student student = new Student("Alice Johnson", "U001", 2, 89.5f);

        System.out.println(university);
        System.out.println(student);
    }
}