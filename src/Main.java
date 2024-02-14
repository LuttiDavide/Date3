import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.parse("2023-03-01T13:00:00Z");

        int year = zdt.getYear();
        int month = zdt.getMonthValue();
        int day = zdt.getDayOfMonth();
        String dayOfWeek = zdt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        System.out.println("Anno : " + year);
        System.out.println("Mese : " + month);
        System.out.println("Giorno : " + day);
        System.out.println("Giorno della settimana : " + dayOfWeek);
    }
}