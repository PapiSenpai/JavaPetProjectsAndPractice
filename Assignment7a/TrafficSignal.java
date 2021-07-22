package Assignment7a;


// enum for Traffic signs (For Assignment 7a)
public enum TrafficSignal {
    //Declare constants of enum
    GREEN("45"),
    YELLOW("10"),
    RED("45"),
    WALK("35"),
    DONTWALK("45");

    // instance fields
    private final String SECONDS;

    // enum constructor
    TrafficSignal(String SECONDS) {
        this.SECONDS = SECONDS;
    }

    // accessor for seconds
    public String getSeconds() {
        return SECONDS;
    }
}
