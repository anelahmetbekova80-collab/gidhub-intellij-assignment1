public class Student extends Human{
    private String educationalProgram;
    private float course;
    public static int count=0;

    public Student(int age, String name, boolean aituStudent, String educationalProgram, float course){
        super(age, name, aituStudent);
        this.educationalProgram=educationalProgram;
        this.course=course;
        count++;
    }

    public String getEducationalProgram() {
        return educationalProgram;
    }

    public void setEducationalProgram(String educationalProgram) {
        this.educationalProgram = educationalProgram;
    }

    public float getCourse() {
        return course;
    }

    public void setCourse(float course) {
        this.course = course;
    }

    public Student(int age, String name, boolean aituStudent) {
        super(age, name, aituStudent);
    }

    public void introducing() {
        System.out.println("Hi everyone, my name is " + getName() + " my educational program is-" + educationalProgram);
    }
}
