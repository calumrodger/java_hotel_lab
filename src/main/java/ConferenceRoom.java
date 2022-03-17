import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private ConfRoomType confRoomType;
    private String name;

    public ConferenceRoom(int capacity, ArrayList<Guest> guestCollection, ConfRoomType confRoomType, String name) {
        super(capacity, guestCollection);
        this.confRoomType = confRoomType;
        this.name = name;
    }

    public ConfRoomType getBedroomType(){
        return confRoomType;
    }

    public int getBedroomValueFromEnum() {
        return this.confRoomType.getValue();
    }

}
