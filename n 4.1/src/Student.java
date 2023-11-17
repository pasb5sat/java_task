class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class SchoolStudent extends Student {
    private int grade;
    public SchoolStudent(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

// Subclass Студент (UniversityStudent)
class UniversityStudent extends Student {
    private String university; // Университет

    public UniversityStudent(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}