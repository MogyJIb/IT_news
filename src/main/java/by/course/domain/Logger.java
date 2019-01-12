package by.course.domain;

import java.util.Arrays;

public class Logger {
    public void log(String message) {
        System.out.println(message);
    }

    public void log(Throwable throwable) {
        log(throwable.getMessage() + "\n" + Arrays.toString(throwable.getStackTrace()));
    }
}
