public class Guest {

    private String name;
    private int bookingRef;

    public Guest(String name, int bookingRef) {
        this.name = name;
        this.bookingRef = bookingRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef(int bookingRef) {
        this.bookingRef = bookingRef;
    }
}
