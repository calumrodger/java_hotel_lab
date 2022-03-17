public enum ConfRoomType {

    SMALL(1),
    LARGE(2);

    private final int value;

    ConfRoomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
