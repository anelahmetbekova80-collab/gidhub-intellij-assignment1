import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("your age: ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("your name:");
        String name= scanner.nextLine();
        System.out.println("Are you student of AITU?(true or false)");
        boolean aituStudent = scanner.nextBoolean();
        Human human= new Human(age, name, aituStudent);
        human.yourName();
        human.ITuni();

        Employee employee= new Employee(17, "Anel", true, "SMM", 50000);
        employee.introducing();
        employee.salary();

        Student student = new Student(18, "Mansur", true, "MT", 1);
        student.introducing();
    }
}
