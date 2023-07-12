package Phone.models;

public class Handed extends Phone{
    private String country;
    private String status;

    public Handed() {
    }

    public Handed(String country, String status) {
        this.country = country;
        this.status = status;
    }

    public Handed(String id, String name, String price, String amount, String producer, String country, String status) {
        super(id, name, price, amount, producer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "handed{" +
                super.toString() +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
