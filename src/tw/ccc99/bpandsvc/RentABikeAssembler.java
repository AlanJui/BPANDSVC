package tw.ccc99.bpandsvc;

/**
 * Created by AlanJui on 2014/5/17.
 */
public class RentABikeAssembler {
    public static final void main(String[] args) {
        CommandLineView clv = new CommandLineView();
        RentABike rentABike = new ArrayListRentABike("Bruce's Bikes");
        clv.setRentABike(rentABike);
        clv.printAllBikes();
    }
}
