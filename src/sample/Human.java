package sample;

public class Human extends Race {

    // DECLARATIONS
    protected String race_title = "Human";
    protected String race_equipment = "Travel clothing.";

    // CONSTRUCTOR
    public Human() {
    }

    // GETTERS
    @Override
    public String getRace_title() {
        return race_title;
    }

    @Override
    public String getRace_equipment() { return race_equipment; }

}   // END OF Human class