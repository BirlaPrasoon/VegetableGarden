package Model.Vegetables;

import Model.BaseClasses.VegType;
import Model.BaseClasses.Vegetable;

public class Spinach extends Vegetable {
    protected Spinach() {
        super("Spinach", VegType.LEAF);
        setInstructions("Spinach grows most quickly in well-drained soil rich in organic matter.");

    }

    @Override
    public void feed() {
        System.out.println("Feeding with 6-6-6 Nitroen only Fertilizer.");
    }

    @Override
    public void water() {
        System.out.println("Watering Spinach plants");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting enough big leaves...");
    }
}
