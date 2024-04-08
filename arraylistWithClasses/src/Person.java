public class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(int id, String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
