public class Clock {
    private Counter hours;
    private Counter minutes;
    private Counter seconds;

    public Clock {
    int Hours;
    int Minutes;
    int Seconds;


        this.hours = new Counter(24, Hours);
        this.minutes = new Counter(60, Minutes);
        this.seconds = new Counter(60, Seconds);
    }
}