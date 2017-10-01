package Model.BaseClasses;

public interface Growable {

    void feed();

    void water();                   // methods that every kind of vegetable entails

    String getInstructions();

    void harvest();

}
