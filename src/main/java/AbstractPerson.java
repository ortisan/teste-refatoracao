import java.util.List;

public class AbstractPerson <A extends Address> {

    private String name;

    protected List<? extends Address> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<? extends Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<? extends Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + "{" +
                "name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
