import java.util.Arrays;
import java.util.Comparator;

class Name implements Comparable<Name>{

    String firstName;
    String lastName;

    Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return "("+ firstName + " , " + lastName  + ")";
    }

    @Override
    public int compareTo(Name o) {
        if(this.firstName.compareTo(o.firstName) != 0){
            return this.firstName.compareTo(o.firstName);
        }
        return this.lastName.compareTo(o.lastName);
    }
}


public class ComparableInterface {
    public static void main(String[] args) {
        Name[] n = {new Name("Siva", "Korlakunta"),
                new Name("Nitin", "Kokkoori"),
                new Name("Akhila", "Bollapalli"),
                new Name("Siva", "Kii")
        };

        System.out.println("Before sorting");
        for(Name name : n){
            System.out.println(name);
        }

        System.out.println("--------------------");
        System.out.println("After sorting");
        Arrays.sort(n);

        for(Name name : n){
            System.out.println(name);
        }


    }
}
