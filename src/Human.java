public class Human {
    private int age;
    private String name;
    private boolean aituStudent;

    public Human(int age, String name, boolean aituStudent){
        this.age=age;
        this.name=name;
        this.aituStudent=aituStudent;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean aituStudent() {
        return aituStudent;
    }

    public void aituStudent(boolean aituStudent) {
        this.aituStudent = aituStudent;
    }
    public void yourName(){
        System.out.println("hello my name is " +name);
    }
    public void ITuni(){
        System.out.println("famous IT uni in AStana is AITU");
    }
}
