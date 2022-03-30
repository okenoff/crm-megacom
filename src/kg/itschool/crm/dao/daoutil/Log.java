package kg.itschool.crm.dao.daoutil;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Log {
    public static String info(String className, String targetName, String massege) {
        return String.format("%s[INFO] ----- %s ----- %s -----%s", LocalDateTime.now(), className,
                targetName, massege);
    }

    public static String error(String className, String targetName, String massege) {
        return String.format("%s[ERROR] ----- %s ----- %s -----%s", LocalDateTime.now(), className,
                targetName, massege);
    }
}