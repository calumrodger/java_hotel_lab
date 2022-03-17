import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRoomsMap;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRoomsMap) {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRoomsMap = new HashMap<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getBedroomSize(){
        return this.bedrooms.size();
    }

    public int getConferenceRoomSize(){
        return this.conferenceRooms.size();
    }

    public Booking createBooking(int numberOfNights, Bedroom bedroom) {
        return new Booking(numberOfNights, bedroom);
    }

    public void addDiningRoom(DiningRoom room){
        this.diningRoomsMap.put(room.getName(), room);
    }


    public int getDiningRoomsMapSize() {
        return this.diningRoomsMap.size();
    }
}
