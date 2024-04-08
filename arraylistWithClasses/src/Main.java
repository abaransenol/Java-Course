import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1,"Ali Baran","Şenol"));
        people.add(new Person(2,"Şevval Ceren","Şenol"));
        people.add(new Person(3,"Zeynep Ecrin","Şenol"));

        for (Person person: people){
            System.out.println(person.getFirstName());
        }
    }
}