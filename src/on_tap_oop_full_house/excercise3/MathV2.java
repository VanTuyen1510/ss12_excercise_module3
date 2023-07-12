package on_tap_oop_full_house.excercise3;

public class MathV2 {
    MathV2(){

    }
    public static double add(double a , double b){
        return a + b;
    }
    public static double multiply(double a , double b){
        return a * b;
    }
    public static double divide(double a , double b){
        if(b == 0){
            return 0d;
        }
        return a/b;

        // return (b == 0d ? 0d : a/ b);
    }

}
