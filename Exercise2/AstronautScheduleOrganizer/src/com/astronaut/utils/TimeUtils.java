package com.astronaut.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeUtils {

    private static final DateTimeFormatter[] FORMATTERS = {
            DateTimeFormatter.ofPattern("HH:mm"),
            DateTimeFormatter.ofPattern("HHmm")
    };

    public static boolean isValidTime(String time) {
        for (DateTimeFormatter fmt : FORMATTERS) {
            try {
                LocalTime.parse(time, fmt);
                return true;
            } catch (DateTimeParseException e) {}
        }
        return false;
    }

    public static LocalTime parseTime(String time) {
        for (DateTimeFormatter fmt : FORMATTERS) {
            try {
                return LocalTime.parse(time, fmt);
            } catch (DateTimeParseException e) {}
        }
        throw new IllegalArgumentException("Invalid time format: " + time);
    }

    public static boolean isOverlap(String start1, String end1, String start2, String end2) {
        LocalTime s1 = parseTime(start1);
        LocalTime e1 = parseTime(end1);
        LocalTime s2 = parseTime(start2);
        LocalTime e2 = parseTime(end2);
        return s1.isBefore(e2) && s2.isBefore(e1);
    }
}
