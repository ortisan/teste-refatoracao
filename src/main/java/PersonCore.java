import java.util.List;

public class PersonCore {

    public void validate(Person person) {
        System.out.println("person = " + person);
        final List<Address> addresses = person.getAddresses();
        System.out.println("addresses = " + addresses);
    }

    public void validate(PersonContext person) {
        System.out.println("personContexxxxt = " + person);
        final List<Address> addresses = person.getAddresses();
        System.out.println("addresses = " + addresses);
    }
}
