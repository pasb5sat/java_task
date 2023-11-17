public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Ivan", 15, 9);
        students[1] = new SchoolStudent("Maria", 13, 7);
        students[2] = new UniversityStudent("Alex", 20, "MIREA");
        students[3] = new UniversityStudent("Elsa", 19, "MGU");
        students[4] = new SchoolStudent("Sergei", 18, 11);
        System.out.println("Students:");
        for (Student student : students) {
            if (student instanceof UniversityStudent) {
                UniversityStudent universityStudent = (UniversityStudent) student;
                System.out.println("Name: " + universityStudent.getName() + ", Age: " + universityStudent.getAge() + ", University: " + universityStudent.getUniversity());
            }
        }
        System.out.println("\nSchool Students:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("Name: " + schoolStudent.getName() + ", Age: " + schoolStudent.getAge() + ", Grade: " + schoolStudent.getGrade());
            }
        }
    }
}