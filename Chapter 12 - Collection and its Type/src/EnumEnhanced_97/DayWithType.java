package EnumEnhanced_97;

public enum DayWithType {
    MONDAY ("It's a working Day"),
    TUESDAY("It's a working Day"),
    WEDNESDAY("It's a working Day"),
    THURSDAY("It's a working Day"),
    FRIDAY("It's a working Day"),
    SATURDAY("Yay, its a Holiday"),
    SUNDAY("Yay, its a Holiday");

    private final String dayType;
    DayWithType(String typ){
        this.dayType = typ;
    }

    public String getDayType() {
        return dayType;
    }
}
