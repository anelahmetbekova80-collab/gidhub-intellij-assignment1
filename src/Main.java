public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(18, "Mansur", true, "MT", 1);
        s1.yourName();
        s1.doSomething();
        s1.study();
        s1.attendClasses();
        s1.greet();
        System.out.println("University: " + s1.UNIVERSITY_NAME);

        Human h1 = new Student(19, "Aruzhan", true, "CS", 2);
        h1.yourName();
        h1.doSomething();

        IStudy iStudent = new Student(20, "Dana", true, "SE", 1);
        iStudent.study();
        iStudent.attendClasses();

        Employee e1 = new Employee(25, "Anel", true, "SMM", 50000);
        e1.yourName();
        e1.doSomething();
        e1.study();
        e1.attendClasses();
        e1.work();
        e1.takeBreak();

        Human h2 = new Employee(26, "Mansur", true, "Developer", 60000);
        h2.yourName();
        h2.doSomething();

        IWork iEmployee = new Employee(27, "Aruzhan", true, "Manager", 70000);
        iEmployee.work();
        iEmployee.takeBreak();

        Student.showStudentsCount();
    }
}
