import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

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
    public void canGetRoomType(){
        assertEquals(BedroomType.SINGLE, singleRoom.getBedroomType());
        assertEquals(BedroomType.DOUBLE, doubleRoom.getBedroomType());
    }

    @Test
    public void bedroomHasValueToo(){
        assertEquals(1, singleRoom.getBedroomValueFromEnum());
    }


}
