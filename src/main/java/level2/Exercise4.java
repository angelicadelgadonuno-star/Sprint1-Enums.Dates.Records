package level2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercise4 {

    private static final DateTimeFormatter ISO          = DateTimeFormatter.ISO_DATE_TIME;
    private static final DateTimeFormatter CLASSIC_DATE = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_ONLY    = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter LONG_ENGLISH = DateTimeFormatter.ofPattern(
            "EEEE, d MMMM yyyy", Locale.ENGLISH);

    public String formatIso(LocalDateTime dt) {
        return dt.format(ISO);
    }

    public String formatClassic(LocalDateTime dt){
        return dt.format(CLASSIC_DATE);
    }

    public String formatTime(LocalDateTime dt) {
        return dt.format(TIME_ONLY);
    }

    public String formatLongEnglish(LocalDateTime dt) {
        return dt.format(LONG_ENGLISH);
    }

}

