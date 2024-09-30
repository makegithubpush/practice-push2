import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df);
        String mydate1 = dt.format(df);//Creating Date String using Date and format
        System.out.println(mydate1);

        String myDate2 = dt.format(df2); //Creating Date String using Date and format
        System.out.println(myDate2);
    }
}