import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bedroom extends Room {

    private BedroomType bedroomType;
    private int rate;


    public Bedroom(int capacity, ArrayList<Guest>guestCollection, BedroomType bedroomType, int rate) {
        super(capacity, guestCollection);
        this.bedroomType = bedroomType;
        this.rate = rate;
    }

    public BedroomType getBedroomType(){
        return bedroomType;
    }

    public int getBedroomValueFromEnum() {
        return this.bedroomType.getValue();
    }

    public int getRate() {
        return rate;
    }



}
