public enum RoomType {
    SINGLE(1, 50.00),
    DOUBLE(2, 100.00),
    TRIPLE(3, 150.00),
    FAMILY(4, 200.00);

    private final int value;
    private final double price;

    RoomType(int value, double price){
        this.value = value;
        this.price = price;
    }

    public int getValue(){
        return this.value;
    }

    public double getPrice() {
        return price;
    }

    RoomType[] roomTypes = RoomType.values();
}
