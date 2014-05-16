package tw.ccc99.bpandsvc;

/**
 * Created by AlanJui on 2014/5/17.
 */

import java.util.*;
public class CommandLineView {

    private RentABike rentABike;

    public CommandLineView() {
        rentABike = new RentABike("Bruce's Bikes");
    }

    public void printAllBikes() {
        System.out.println(rentABike.toString());
        Iterator<Bike> iter = rentABike.getBikes().iterator();
        while (iter.hasNext()) {
            Bike bike = iter.next();
            System.out.println(bike.toString());
        }
    }

    public static final void main(String[] args) {
        CommandLineView clv = new CommandLineView();
        clv.printAllBikes();
    }
}

