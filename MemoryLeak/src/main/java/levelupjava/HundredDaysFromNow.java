package levelupjava;

import java.time.LocalDate;
import java.time.Period;

public class HundredDaysFromNow {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("100 days from now is ... " + calculate100DaysFromToday(localDate) );
    }

    private static LocalDate calculate100DaysFromToday(LocalDate todaysDate) {

        Period period = Period.ofDays(100);

        return todaysDate.plus(period);
    }


}
