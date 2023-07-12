package ss07_abstract_interface;

public abstract class Superman extends Person implements IFLY {
    @Override
    public void love() {
        System.out.println("Tình yêu của siêu nhân");
    }

    @Override
    public void fly() {
        System.out.println("Tự bay lên");
    }

}
