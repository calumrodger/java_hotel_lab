import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom singleRoom;
    Bedroom doubleRoom;
    ConferenceRoom smallConfRoom;
    ConferenceRoom largeConfRoom;
    Guest guest1;
    Guest guest2;
    Hotel hotel;
    Booking booking;

    @Before
    public void before() {
        guest1 = new Guest("Jim", 437);
        guest2 = new Guest("Jane", 213);
        singleRoom = new Bedroom(1, null, BedroomType.SINGLE, 10);
        doubleRoom = new Bedroom(2, null, BedroomType.DOUBLE, 20);
        smallConfRoom = new ConferenceRoom(5, null, ConfRoomType.SMALL, "Small Room");
        largeConfRoom = new ConferenceRoom(10, null, ConfRoomType.LARGE, "Large One");
        hotel = new Hotel(null, null, null);
        booking = new Booking(2, singleRoom);
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(20, booking.getTotalBill());
    }
}
