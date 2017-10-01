package Model.BaseClasses;

public abstract class Vegetable implements Growable {

    private String name;
    private VegType type;
    private String instructions;

    protected Vegetable(String name, VegType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions){
        this.instructions = instructions;
    }

    public VegType getType() {
        return type;
    }

}
