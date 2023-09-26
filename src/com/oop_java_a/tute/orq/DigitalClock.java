package com.oop_java_a.tute.orq;

public class DigitalClock {
    private int hours, minutes, seconds;

    public DigitalClock() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public DigitalClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.println("The time is " + hours + "." + minutes + "." + seconds);
    }

    public int setHours(int hours) {
        if (hours >= 0 && hours <= 23)
            this.hours = hours;
        else
            hours = 0;
        return hours;
    }

    public int setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            minutes = 0;
        return minutes;
    }

    public int setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59)
            this.seconds = seconds;
        else
            seconds = 0;
        return seconds;
    }

    public void tick() {
        seconds++;
    }

}
