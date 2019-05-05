import java.time.*;
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






        
    }
}