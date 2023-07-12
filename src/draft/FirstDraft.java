package draft;

import java.time.LocalDate;
import java.util.Date;

public class FirstDraft {
    public static void main(String[] args) {
        String date = "15/10/1997";
        long date1 = Date.parse(date);
        System.out.println(date1);
        System.out.println((new Date().getTime()));
    }
}
