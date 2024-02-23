// Weekdays.java
package days;

public enum Weekdays {
    ONE("Monday"),
    TWO("Tuesday"),
    THREE("Wednesday"),
    FOUR("Thursday"),
    FIVE("Friday"),
    SIX("Saturday"),
    SEVEN("Sunday");

    private final String dayName;

    Weekdays(String dayName) {
        this.dayName = dayName;
    }

    @Override
    public String toString() {
        return dayName;
    }
}