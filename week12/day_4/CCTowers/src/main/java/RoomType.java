public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    CONF(50),
    DINING(40);

    private int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
