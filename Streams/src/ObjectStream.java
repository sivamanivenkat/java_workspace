import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int age;
    String univ;

    public Student(String name, int age, String univ){
        this.name = name;
        this.age = age;
        this.univ = univ;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getUniv() {
        return univ;
    }

}

public class ObjectStream {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Venkat",25,"VIT"));
        studentList.add(new Student("Siva",19,"JNTUK"));
        studentList.add(new Student("Mani",20,"VITAP"));
        studentList.add(new Student("Akhila",22,"MLR"));
        studentList.add(new Student("Nitin",26,"SRM"));
        studentList.add(new Student("Nair",18,"SRM"));
        studentList.add(new Student("Vikranth",23,"VIT"));

        int studentAgeAbove20 = (int)studentList.stream().filter(s -> s.getAge()>20).count();
        System.out.println("Number of students with age above 20 : " + studentAgeAbove20);

        List<Student> studentsfromVIT = studentList.stream().filter(s->s.getUniv().equalsIgnoreCase("vit")).collect(Collectors.toList());
        System.out.println("Students from VIT : ");
        studentsfromVIT.forEach(s->System.out.println(s.getName()));

        List<Student> NamesContainingN = studentList.stream().filter(s->s.getName().contains("n")).collect(Collectors.toList());
        System.out.println("Students Containing letter I in their names : ");
        NamesContainingN.forEach(s->System.out.println(s.getName()));
    }
}
