
public class Booking {

    private int numberOfNights;
    private Bedroom bookedRoom;

    public Booking(int numberOfNights, Bedroom bookedRoom) {
        this.numberOfNights = numberOfNights;
        this.bookedRoom = bookedRoom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBookedRoom() {
        return bookedRoom;
    }

    public int getTotalBill(){
        return (numberOfNights * bookedRoom.getRate());
    }



//    public void setBookedRoom(int nightsBooked, Bedroom roomBooking) {
//        newBooking = new Booking();
//        return newBooking;
//    }
}
