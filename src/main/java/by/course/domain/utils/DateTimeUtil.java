package by.course.domain.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DateTimeUtil {

    public static long subtract(LocalDateTime first, LocalDateTime second) {
        return first.toEpochSecond(ZoneOffset.UTC) - second.toEpochSecond(ZoneOffset.UTC);
    }
}
