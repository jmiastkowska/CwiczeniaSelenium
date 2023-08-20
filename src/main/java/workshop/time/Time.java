package workshop.time;

import lombok.val;
import p04_oop.interfaces.stringExample.StringTester;

import java.util.Objects;

public class Time {

    private final int hours, minutes, seconds;

    public Time(String timeString){  //13:15:54
      String[] elements = timeString.split(":");
         hours = Integer.parseInt(elements[0]);
        minutes = Integer.parseInt(elements[1]);
        seconds = Integer.parseInt(elements[2]);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time addSeconds(int seconds) {
        // //13:15:54 + 3s -> 13:15.57
        int minutesToAdd = (this.seconds + seconds)/60;
        int newSecondValues = (this.seconds + seconds)% 60;
        return
            new Time(hours, minutes, newSecondValues).addMinutes(minutesToAdd);
    }

    public Time addMinutes(int minutes) {
        int hoursToAdd = (this.minutes + minutes)/60;
        int newMinutesValue= (this.minutes + minutes)% 60;
        return new Time(this.hours, newMinutesValue, this.seconds).addHours(hoursToAdd);
    }

    public Time addHours(int hours) {
        int newHoursValue = (this.hours + hours) % 24;
        return new Time(newHoursValue, this.minutes, this.seconds);

    }

    @Override
    public String toString(){
        return  String.format("%02d:%02d:%02d", hours, minutes,seconds);  //ustawiładny format godziny 00:00:00
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hours == time.hours &&
                minutes == time.minutes &&
                seconds == time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
