package main.chapter_3_core_java_api;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDateTimeClass {

    /*
        In order to use we need to import
        import java.time.*;

        LocalDate contains just a date-no time and no time zone
        LocalTime contains just time no date and no time zone
        LocalDateTime contains both date and time but no time zone

        Date time classes have private constructor to force you to use the static methods
        This is invalid LocalDate d= new LocalDate(); does not compile
        LocalDate.of(2017, Month.January, 32); throws exception invalid value of DayOfMonth
     */

    public static void createDate() {
        /*
            public static LocalDate of(int year, int month, int dayOfMonth)
            public static LocalDate of(int year, Month month, int dayOfMonth)
         */
        LocalDate date1 = LocalDate.of(2017, Month.DECEMBER, 26);
        LocalDate date2 = LocalDate.of(2017, 12, 26);
        print(date1);
        print(date2);
    }

    public static void createTime() {
        LocalTime time1 = LocalTime.of(12, 34);
        LocalTime time2 = LocalTime.of(22, 14, 44);
        LocalTime time3 = LocalTime.of(1, 54, 44, 100);

    }

    public static void createDateTime() {
        LocalTime time1 = LocalTime.of(12, 34);
        LocalDate date1 = LocalDate.of(2017, Month.DECEMBER, 26);

        LocalDateTime dateTime = LocalDateTime.of(2015, Month.AUGUST, 20, 1, 34);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);

        print("First example " + dateTime + "Second example " + dateTime1);

    }

    public static void dateTimeExample() {
        print(LocalTime.now());
        print(LocalDate.now());
        print(LocalDateTime.now());
    }

    public static void manipulatingDateTime() {
        /*
            DateTime classes are immutable just like String
         */

        LocalDate date = LocalDate.now();
        print(date);
        date = date.plusDays(3);
        print(date);
        print(date.plusWeeks(2));
        print(date.plusMonths(1));
        print(date.plusYears(1));
        /*
            We cant call methods regarding Time on Date objects and vice versa

            like date.plusMinutes(1) Does not compile

            or LocalTime time= LocalTime.now();
                  time.plusDays(3);

         */
    }

    public static void workingWithPeriods() {

        Period annually = Period.ofYears(1); //Period of one year
        Period quarterly = Period.ofMonths(3); //every 3 months
        Period everyTwoYearAndWeek = Period.of(2, 0, 7);
            /*
                We cannot chanin methods when creating Periods only last method is used
             */
        Period methodChainingExample = Period.ofYears(2).ofWeeks(1);// only last method is executed every week
            /*
                Using periods
             */
        LocalDate date = LocalDate.now();
        print(date.plus(annually));
        print(date.plus(quarterly));
        print(date.plus(everyTwoYearAndWeek));
    }

    public static void formattingDateTime() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        print(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        print(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        print(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        /*
            Predefined DateTimeFormaters
         */
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        print(shortDateTime.format(date));
        //print(shortDateTime.format(time)); will throw UnsupportedTemporalTypeException we are trying to format time but we need dateS

        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        print(dateTime.format(shortDateTime2));
        print(date.format(shortDateTime3));
        print(time.format(shortDateTime4));

        /*
            We cant call Formatter.ofLocalizedDate on Time and vice verse  we cant call Formatter.ofLocalizedTime on Date
            and we cant call Formatter.ofLocalizedDateTime on object Time or object Date  it will throw exception
         */
        /*
            We can create our own pattern
         */

        DateTimeFormatter myPattern = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        print(dateTime.format(myPattern));

    }

    public static void parsingDateTime() {
        DateTimeFormatter myPattern = DateTimeFormatter.ofPattern("MM dd, yyyy");
        LocalDate date = LocalDate.parse("01 02, 2019", myPattern);
        print(date);
    }


    private static void print(Object o) {
        System.out.println(o);
    }


}
