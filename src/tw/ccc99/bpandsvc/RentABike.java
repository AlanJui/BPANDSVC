package tw.ccc99.bpandsvc;

/**
 * Created by AlanJui on 2014/5/17.
 */

import java.util.*;

public interface RentABike {
    List<Bike> getBikes();
    Bike getBike(String serialNo);
}
