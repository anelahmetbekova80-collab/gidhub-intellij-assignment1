public final class Student extends Human implements IStudy {
    private String educationalProgram;
    private float course;
    public static int studentsCount = 0;
    public final String UNIVERSITY_NAME = "AITU"; // final field

    public Student(int age, String name, boolean isAituStudent, String educationalProgram, float course) {
        super(age, name, isAituStudent);
        this.educationalProgram = educationalProgram;
        this.course = course;
        studentsCount++;
    }
    @Override
    public void yourName() {
        System.out.println("Hi, I am a student. My name is " + getName());
    }
    @Override
    public void doSomething() { // abstract method
        System.out.println(getName() + " is learning and improving skills");
    }
    public final void greet() { // final method
        System.out.println("Hello from Student class");
    }
    @Override
    public void study() {
        System.out.println(getName() + " is studying at " + educationalProgram);
    }
    @Override
    public void attendClasses() {
        System.out.println(getName() + " attends classes");
    }
    public String getEducationalProgram() { return educationalProgram; }
    public void setEducationalProgram(String educationalProgram) { this.educationalProgram = educationalProgram; }
    public float getCourse() { return course; }
    public void setCourse(float course) { this.course = course; }

    public static void showStudentsCount() {
        System.out.println("Total students: " + studentsCount);
    }
}