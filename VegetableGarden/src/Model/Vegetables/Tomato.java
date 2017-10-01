package Model.Vegetables;

import Model.BaseClasses.VegType;
import Model.BaseClasses.Vegetable;

public class Tomato extends Vegetable {

    Tomato() {
        super("Tomato", VegType.SEED);
        setInstructions("Start seeds indoors 6-8 weeks early");
    }

    @Override
    public void feed() {
        System.out.println("Feeding 3 spoons of Tomato-tone... ");
    }

    @Override
    public void water() {
        System.out.println("Todays watering for the tomatoes is being done... ");
    }

    @Override
    public void harvest() {
        System.out.println("Picking up the perfect size and perfect red Tomatoes... ");
    }
}
