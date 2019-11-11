import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String description;
        String input;
        int counter = 1;

        Scanner key = new Scanner(System.in);

        ArrayList<Job> jobInfo = new ArrayList<>();

        System.out.println("Please enter 5 jobs");

        while (counter <= 5) { // while the counter is less than or equal to five it will persist
            Job job = new Job();

            System.out.println("Please enter the name of the job: ");
            name = key.nextLine();
            job.setName(name);

            System.out.println("Please enter a job description: ");
            description = key.nextLine();
            job.setDescription(description);

            jobInfo.add(job);

            counter++;

        }
        counter = 1;
        for (Job job : jobInfo){

            System.out.println(counter);
            job.printText();

            counter = counter + 1;

        }

        System.out.println("Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. " +
                "It is an important part of OOPs (Object Oriented programming system). " +
                "The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.");

        System.out.println();
        System.out.println("Composition is the design technique to implement has-a relationship in classes. " +
                "We can use java inheritance or Object composition for code reuse. " +
                "Java composition is achieved by using instance variables that refers to other objects.");
        System.out.println();
        System.out.println("Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. ... Declare the variables of a class as private. " +
                "Provide public setter and getter methods to modify and view the variables values.");
        System.out.println();
        System.out.println("Polymorphism is the ability of an object to take on many forms. " +
                "The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object. " +
                "Any Java object that can pass more than one IS-A test is considered to be polymorphic.");
    }
}
