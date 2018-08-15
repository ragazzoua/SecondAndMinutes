package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 0));
        System.out.println(getDurationString(1200L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 60)) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        String x = getDurationString(minutes, remainingSeconds);
        return x;
    }
}
