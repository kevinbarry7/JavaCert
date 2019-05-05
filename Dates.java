import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class Dates {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println();

        LocalDate date1 = LocalDate.of(2018, Month.MAY, 4);
        LocalDate date2 = LocalDate.of(2019, 5, 4);
        System.out.println(date1 + " " + date2);
        System.out.println();
        
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);

        LocalDateTime dateTime1 = LocalDateTime.of(2019, Month.MAY, 5, 10, 50, 05, 200);
        System.out.println(dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime2);
        System.out.println("____________");

        LocalDate date = LocalDate.of(2019, 05, 05);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusMonths(2);
        System.out.println(date);
        date = date.plusYears(2);
        System.out.println(date);
        date = date.minusDays(8);
        System.out.println(date);
        date = date.minusYears(2);
        System.out.println(date);
        System.out.println("____________");

        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime1.plus(period));
        //System.out.println(time1.plus(period));
        System.out.println("____________");

        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
        System.out.println("____________");

        LocalDate date4 = LocalDate.of(2019, Month.JUNE, 10);
        LocalTime time4 = LocalTime.of(11, 10, 20);
        LocalDateTime dateTime4 = LocalDateTime.of(date4, time4);
        System.out.println(date4.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time4.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime4.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(shortDateTime.format(dateTime4));
        System.out.println(shortDateTime.format(date4));
        //System.out.println(shortDateTime.format(time4)); 








        
    }
}