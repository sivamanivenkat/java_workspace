import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class compareName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ObjectsInAL {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Venkat", 25));
        student.add(new Student("Siva", 24));
        student.add(new Student("Mani", 26));

        for(Student std : student){
            System.out.println("Student's Name : "+ std.getName() +", Student's age : "+std.getAge());
        }

        System.out.println("After Sorting.....");

        Collections.sort(student, new compareName());

        for(Student std : student){
            System.out.println("Student's Name : "+ std.getName() +", Student's age : "+std.getAge());
        }

    }
}
