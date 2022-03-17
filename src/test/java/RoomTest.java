import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom singleRoom;
    Bedroom doubleRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Jim", 437);
        guest2 = new Guest("Jane", 213);
        singleRoom = new Bedroom(1, null, BedroomType.SINGLE, 10);
        doubleRoom = new Bedroom(2, null, BedroomType.DOUBLE, 20);
    }

    @Test
    public void canGetGuestCollection(){
        assertEquals(0, singleRoom.getGuestCollectionSize());
    }

    @Test
    public void canAddGuestToBedroom(){
    doubleRoom.addGuest(guest1);
    doubleRoom.addGuest(guest2);
    assertEquals(2, doubleRoom.getGuestCollectionSize());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
    doubleRoom.addGuest(guest1);
    doubleRoom.addGuest(guest2);
    doubleRoom.removeGuest(guest1);
    assertEquals(1, doubleRoom.getGuestCollectionSize());
    }

    @Test
    public void canGetGuestCollectionSize(){
        singleRoom.addGuest(guest1);
        assertEquals(1, singleRoom.getGuestCollectionSize());
    }
}
