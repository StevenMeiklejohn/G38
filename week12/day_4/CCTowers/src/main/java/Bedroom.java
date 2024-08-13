public class Bedroom extends Room{

    public int roomNumber;

    public double nightlyRate;

    public Bedroom(int capacity, RoomType roomType, int roomNumber, double nightlyRate) {
        super(capacity, roomType);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
