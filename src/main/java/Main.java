import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Marcelo");
        final Address address = new Address();
        address.setCity("São Paulo");
        person.setAddresses(Arrays.asList(address));

        final PersonCore personCore = new PersonCore();
        personCore.validate(person);

        PersonContext personContext = new PersonContext();
        personContext.setName("Mama");
        final AddressContext addressContext = new AddressContext();
        addressContext.setCity("Sampa");
        personContext.setAddresses(Arrays.asList(addressContext));
        personCore.validate(personContext);
    }
}
