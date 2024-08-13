import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;

    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.confRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void addDiningRoom(DiningRoom diningRoom){
        this.diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConfRooms() {
        return confRooms;
    }

    public void setConfRooms(ArrayList<ConferenceRoom> confRooms) {
        this.confRooms = confRooms;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConfRooms(ConferenceRoom confRoom){
        this.confRooms.add(confRoom);
    }

    public void addGuestToBedroom(int roomNumber, Guest guest){
        for(Bedroom bedroom : this.bedrooms){
            if(bedroom.getRoomNumber() == roomNumber){
                bedroom.addGuest(guest);
            }
        }
    }

    public void addGuestToConfRoom(String roomName, Guest guest){
        for(ConferenceRoom confRoom : this.confRooms){
            if(confRoom.getName() == roomName){
                confRoom.addGuest(guest);
            }
        }
    }

    public Booking bookRoom(Bedroom bedroom, int noOfNights){
        return new Booking(bedroom, noOfNights);

    }

}
