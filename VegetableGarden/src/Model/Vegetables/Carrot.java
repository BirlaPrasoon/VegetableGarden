package Model.Vegetables;

import Model.BaseClasses.VegType;
import Model.BaseClasses.Vegetable;

public class Carrot extends Vegetable {

    protected Carrot() {
        super("Carrot", VegType.ROOT);
        setInstructions("Plant 3-5 weeks before last spring frost");
    }

    @Override
    public void feed() {
        System.out.println("Feeding with 1-2-2 label NPK fertilizer.");
    }

    @Override
    public void water() {
        System.out.println("Watering Carrot plants... ");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting the baby carrots... ");
    }
}
