import java.util.ArrayList;
import java.util.HashMap;

public class DiningRoom extends Room {

    private String name;

    public DiningRoom(int capacity, ArrayList<Guest> guestCollection, String name) {
        super(capacity, guestCollection);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
