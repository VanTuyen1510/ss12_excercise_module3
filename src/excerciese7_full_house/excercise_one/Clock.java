package excerciese7_full_house.excercise_one;

public class Clock {
    private int hour;
    public int minute;
    public int second;

    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public  void adjustHour(int amount){
        if(amount < 0){
            this.hour -= 1;
        }
    }
    public  void adjustMinute(int amount){
        if(amount < 0){
            this.minute -= 1;
        }
    }
    public void adjustSecond(int amount) // ??? vì sao không dùng amount trỏ được
    {
        if(amount < 0){
            this.second -= 1;
        }
    }

    public boolean equals(Clock ohter)// ??? tại sao ko dùng Integer.toString được ???
    {
       if(String.valueOf(hour).equals(String.valueOf(ohter.hour)) && String.valueOf(second).equals(String.valueOf(ohter.second)) && String.valueOf(minute).equals(String.valueOf(ohter.minute))){
           return true;
       }
       return false;
    }
    public String toString(){
        return  " Clock : [" + this.hour + ":" + this.minute + ":" + this.second + "]";
    }
}
