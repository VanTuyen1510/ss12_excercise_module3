package on_tap_oop_full_house.excercise7;

public class Fraction {
    private int numer;
    private int denom;

    public Fraction(int number, int demon) {

//        if (demon == 0) {
//            return;
//    } Đây là sai

        if(demon == 0){
            throw new ArithmeticException("Demo cannot by zero !");
        }

        this.numer = number;
        this.denom = demon;
    }

    // lấy fraction hiện tại + fraction other
    public Fraction add(Fraction other) {
        int newNumer = this.numer * other.denom + this.denom * other.numer;
        int newDemon = this.denom * other.denom;

        return new Fraction(newNumer, newDemon);
    }

    @Override
    public String toString() {
        return numer + "/" + denom;
    }

}
