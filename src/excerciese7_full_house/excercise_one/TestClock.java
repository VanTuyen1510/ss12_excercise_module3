package excerciese7_full_house.excercise_one;

public class TestClock {
    public static void main(String[] args) {
        Clock clock = new Clock(8,30,31);
        Clock clock1 = new Clock(8,32,31);
        System.out.println(clock.equals(clock1));
        clock.adjustHour(-30);
        clock.adjustMinute(-50);
        clock.adjustSecond(-60);
        System.out.println(clock);

    }
}
