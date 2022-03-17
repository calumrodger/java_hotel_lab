import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

        Bedroom singleRoom;
        Bedroom doubleRoom;
        ConferenceRoom smallConfRoom;
        ConferenceRoom largeConfRoom;
        Guest guest1;
        Guest guest2;
        Hotel hotel;
        Booking booking;
        DiningRoom diningRoom1;
        DiningRoom diningRoom2;

        @Before
        public void before(){
            guest1 = new Guest("Jim", 437);
            guest2 = new Guest("Jane", 213);
            singleRoom = new Bedroom(1, null, BedroomType.SINGLE, 10);
            doubleRoom = new Bedroom(2, null, BedroomType.DOUBLE, 20);
            smallConfRoom = new ConferenceRoom(5, null, ConfRoomType.SMALL, "Small Room");
            largeConfRoom = new ConferenceRoom(10, null, ConfRoomType.LARGE, "Large One");
            hotel = new Hotel(null, null, null);
            booking = new Booking(2, singleRoom);
            diningRoom1 = new DiningRoom(10, null, "MicDs");
            diningRoom2 = new DiningRoom(20, null, "BK");
        }

        @Test
        public void hasBedroomsAndConferenceRooms(){
            hotel.addBedroom(singleRoom);
            hotel.addBedroom(doubleRoom);
            hotel.addConferenceRoom(smallConfRoom);
            hotel.addConferenceRoom(largeConfRoom);
            assertEquals(2, hotel.getBedroomSize());
            assertEquals(2, hotel.getConferenceRoomSize());
        }

        @Test
        public void canCheckGuestIn(){
            hotel.addBedroom(singleRoom);
            singleRoom.addGuest(guest1);
            assertEquals(1, singleRoom.getGuestCollectionSize());
        }

        @Test
        public void canCheckGuestOut(){
            hotel.addBedroom(doubleRoom);
            doubleRoom.addGuest(guest1);
            doubleRoom.removeGuest(guest1);
            assertEquals(0, doubleRoom.getGuestCollectionSize());
        }

        @Test
        public void hasBooking(){
            hotel.createBooking(2, singleRoom);
            assertEquals(singleRoom, booking.getBookedRoom());
            assertEquals(2, booking.getNumberOfNights());
        }

        @Test
        public void canAddDiningRoom(){
            hotel.addDiningRoom(diningRoom1);
            assertEquals(1, hotel.getDiningRoomsMapSize());
        }




}
