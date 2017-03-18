
public class Person {

    private final long id;
    private String name;
    private String email;
    private int age;

    public Person(final int pId) {
        this.id = pId;
    }

    public final long getId() {
        return id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String pName) {
        this.name = pName;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(final int pAge) {
        this.age = pAge;
    }

}
