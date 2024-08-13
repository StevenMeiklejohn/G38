import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Bedroom bedroom;
    private ConferenceRoom confRoom;
    private Guest guest;
    private Hotel hotel;
    private DiningRoom diningRoom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE.getCapacity(), RoomType.DOUBLE, 101, 50);
        confRoom = new ConferenceRoom(RoomType.CONF.getCapacity(), RoomType.CONF, "Glasgow");
        diningRoom = new DiningRoom(RoomType.DINING.getCapacity(), RoomType.DINING, "The Lunch Trough");
        guest = new Guest("Glen Michael");
        hotel = new Hotel();
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedrooms().size());
    }

    @Test
    public void canAddConfRoom(){
        hotel.addConfRooms(confRoom);
        assertEquals(1, hotel.getConfRooms().size());
    }

    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroom(bedroom);
        hotel.addGuestToBedroom(101, guest);
        assertEquals(1, hotel.getBedrooms().get(0).getGuests().size());
    }

    @Test
    public void canMakeBooking(){
        hotel.addBedroom(bedroom);
        Booking newBooking = hotel.bookRoom(bedroom, 2);
        assertEquals(2, newBooking.getNoOfNights());
    }

    @Test
    public void canGetTotalBill(){
        hotel.addBedroom(bedroom);
        Booking newBooking = hotel.bookRoom(bedroom, 2);
        double totalBill = newBooking.getTotalBill();
        assertEquals(100, totalBill, 0.1);
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        HashMap newDiningRooms = hotel.getDiningRooms();
        assertEquals("The Lunch Trough", hotel.getDiningRooms().get("The Lunch Trough").getName());

    }
}
