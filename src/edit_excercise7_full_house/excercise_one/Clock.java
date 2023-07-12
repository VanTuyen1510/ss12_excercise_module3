package edit_excercise7_full_house.excercise_one;

public class Clock {
    public int hour;
    public int minute;
    public int second;

    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void adjustHour(int amount){
        this.hour += amount;
        this.hour %= 24;

        // hour = 23
        // amount = 2
        // hour + amount = 25
        // 25 % 24 = 1
        // hour = 1


        // hour = 1
        // amount = -2
        // hour = -1
        // hour % 24 = -1
        // Math.abs(hour) = 1 % 24  = 1

        // hour = 1
        // amount = -48
        // hour = -47

    }
}
