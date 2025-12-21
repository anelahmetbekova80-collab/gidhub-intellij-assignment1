public class Employee extends Human{
    private String workingPosition;
    private float salary;

    public Employee(int age, String name, boolean aituStudent, String workingPosition, float salary){
        super(age, name, aituStudent);
        this.workingPosition=workingPosition;
        this.salary=salary;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(int age, String name, boolean aituStudent) {
        super(age, name, aituStudent);
    }

    public void introducing(){
        System.out.println("Hello, my name is "+getName()+ " my working position is "+workingPosition);
    }
    public void salary(){
        System.out.println("my salary: "+ salary);
    }

}
