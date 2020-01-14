public class Address {

    private String city;

    @Override
    public String toString() {
        return this.getClass().toString() + "{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}
