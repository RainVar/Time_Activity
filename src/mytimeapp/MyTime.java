 package mytimeapp;

public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public MyTime(int hours, int minutes, int seconds, boolean meridian) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
    }

    // Setters and Getters
    
    public void advanceTime(int seconds) {
        this.seconds += seconds;
        if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
            if (this.minutes >= 60) {
                this.hours += this.minutes / 60;
                this.minutes %= 60;
                if (this.hours >= 12) {
                    this.hours %= 12;
                    this.meridian = !this.meridian;
                }
            }
        }
    }
    
    public void tickBySecond() {
        advanceTime(1);
    }
    
    public void tickByMinute() {
        advanceTime(60);
    }
    
    public void tickByHour() {
        advanceTime(3600);
    }
    
    public void displayTime12() {
        String meridianString = meridian ? "PM" : "AM";
        int displayedHours = (hours == 0 || hours == 12) ? 12 : hours % 12;
        System.out.printf("%02d:%02d:%02d %s%n", displayedHours, minutes, seconds, meridianString);
    }
    
    public void displayTime24() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
    
    @Override
    public String toString() {
        String meridianString = meridian ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, meridianString);
    }
}
