package Task1And2;

public enum Type {
    VIP("VIP"),
    STANDARD("STANDARD"),
    MEDIUM("MEDIUM");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
