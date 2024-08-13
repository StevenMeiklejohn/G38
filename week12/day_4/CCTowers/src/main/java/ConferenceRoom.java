public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(int capacity, RoomType roomType, String name) {
        super(capacity, roomType);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
