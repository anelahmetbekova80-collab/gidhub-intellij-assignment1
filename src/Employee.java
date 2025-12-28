public class Employee extends Human implements IStudy, IWork {
    private String workingPosition;
    private float salary;

    public Employee(int age, String name, boolean isAituStudent, String workingPosition, float salary){
        super(age, name, isAituStudent);
        this.workingPosition = workingPosition;
        this.salary = salary;
    }
    @Override
    public void yourName(){
        System.out.println("Hello, my name is " + getName());
    }
    @Override
    public void doSomething() {
        System.out.println(getName() + " work hard for future career");
    }
    @Override
    public void study() {
        System.out.println(getName() + " studies for career growth");
    }
    @Override
    public void attendClasses() {
        System.out.println(getName() + " attends professional trainings");
    }
    @Override
    public void work() {
        System.out.println(getName() + " work as " + workingPosition);
    }
    @Override
    public void takeBreak() {
        System.out.println(getName() + " is taking a short break.");
    }
    public String getWorkingPosition() { return workingPosition; }
    public void setWorkingPosition(String workingPosition) { this.workingPosition = workingPosition; }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
}