package ss07_abstract_interface;

public class Pilot extends Person {
    public static final String LOVE  = "Tình yêu của phi công";

    @Override
    public void love() {
        System.out.println(LOVE);
    }
//    double a = super.getId();
}
