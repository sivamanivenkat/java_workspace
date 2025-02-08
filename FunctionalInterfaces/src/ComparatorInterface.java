import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

class Student{
    String name;
    Float marksInMath;
    Float marksInPhysics;

    Student(String name, float marksInMath, float marksInPhysics){
        this.name = name;
        this.marksInMath = marksInMath;
        this.marksInPhysics = marksInPhysics;
    }

    public String getName(){
        return name;
    }
    public Float getMarksInMath() {
        return marksInMath;
    }
    public Float getMarksInPhysics() {
        return marksInPhysics;
    }

    public String toString(){
        return "("+ name + ", "+ marksInMath + " , " + marksInPhysics + ")";
    }
}

class CompareName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareMarksInMath implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarksInMath().compareTo(o2.getMarksInMath());
    }
}

class CompareMarksInPhysics implements Comparator<Student>{

    public int compare(Student o1, Student o2){
        return o1.getMarksInPhysics().compareTo(o2.getMarksInPhysics());
    }
}

public class ComparatorInterface {
    public static void main(String[] args) {

        Student[] s = {
                new Student("Venkat",89.6f,90.5f),
        new Student("Siva",98.6f,87.5f),
        new Student("Mani",78.6f,69.5f),
        new Student("Akhila",92.6f,99.5f)
        };

        System.out.println("Before Sorting");
        for(Student student : s){
            System.out.println(student);
        }

        System.out.println("---------------------");
        System.out.println("After Sorting based on Names");
        Arrays.sort(s, new CompareName());

        for(Student student : s){
            System.out.println(student);
        }
        System.out.println("---------------------");
        System.out.println("After Sorting based on marks in Maths");
        Arrays.sort(s, new CompareMarksInMath());
        for(Student student : s){
            System.out.println(student);
        }

        System.out.println("---------------------");
        System.out.println("After Sorting based on marks in Physics");
        Arrays.sort(s, new CompareMarksInPhysics());
        for(Student student : s){
            System.out.println(student);
        }
    }
}
