package on_tap_oop_full_house.excercise4;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean check(){
        return a + b >= c && a + c >= b && a + c >= a;
    }

    public int perimeter(){
        if(!check()){
            return -1;
        }
        return a + b + c;
    }

    public double area(){
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
