package tw.ccc99.bpandsvc;

/**
 * Created by AlanJui on 2014/5/17.
 */

import java.util.*;

public class ArrayListRentABike implements RentABike {

    private String storeName;
    final List<Bike> bikes = new ArrayList<Bike>();

    public ArrayListRentABike() {
        initBikes();
    }

    public ArrayListRentABike(String storeName) {
        this.storeName = storeName;
        initBikes();
    }

    public void initBikes() {
        bikes.add(new Bike("Shimano", "Roadmaster", 20, "11111", 15, "Fair"));
        bikes.add(new Bike("Cannondale", "F2000 XTR", 18, "22222", 12, "Excellent"));
        bikes.add(new Bike("Trek", "6000", 19, "33333", 12.4, "Fair"));
    }

    @Override
    public String toString() {
        return "RentABike: " + storeName;
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public Bike getBike(String serialNo) {
        Iterator<Bike> iter = bikes.iterator();
        while (iter.hasNext()) {
            Bike bike = iter.next();
            if (serialNo.equals(bike.getSerialNo())) return bike;
        }
        return null;
    }
}
