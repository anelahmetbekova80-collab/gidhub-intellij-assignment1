public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isAituStudent;

    public Human(int age, String name, boolean isAituStudent){
        this.age = age;
        this.name = name;
        this.isAituStudent = isAituStudent;
    }
    public abstract void doSomething();
    public void yourName(){
        System.out.println("hello my name is " + name);
    }
    public void itUni(){
        System.out.println("famous IT uni in Astana is AITU");
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAituStudent() {
        return isAituStudent;
    }
    public void setAituStudent(boolean isAituStudent) {
        this.isAituStudent = isAituStudent;
    }
}