import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestCollection;

    public Room(int capacity, ArrayList<Guest> guestCollection) {
        this.capacity = capacity;
        this.guestCollection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestCollection() {
        return guestCollection;
    }

    public void setGuestCollection(ArrayList<Guest> guestCollection) {
        this.guestCollection = guestCollection;
    }

    public void addGuest(Guest guest){
        this.guestCollection.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guestCollection.remove(guest);
    }

    public int getGuestCollectionSize(){
        return this.guestCollection.size();
    }
}
