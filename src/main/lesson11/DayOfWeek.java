package lesson11;

public enum DayOfWeek {
    MON("Monday", (byte) 1),
    TUE("Tuesday", (byte) 2),
    WED("Wednesday", (byte) 3),
    THU("Thursday", (byte) 4),
    FRI("Friday", (byte) 5),
    SAT("Saturday", (byte) 6),
    SUN("Sunday", (byte) 7);

    private String fullName;
    private byte order;
    private String shoNebud;

//    String, byte
    private DayOfWeek(String name, byte order) {
        this.fullName = name;
        this.order = order;
    }

    public static DayOfWeek from(String name) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.fullName.equals(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("No enum constant with name: " + name);
    }

    public String getFullName() {
        return fullName;
    }

    public byte getOrder() {
        return order;
    }
}
