package sample;

public class Dwarf extends Race {

    // DECLARATIONS
    protected String race_title = "Dwarf";
    protected int racial_ability_mod_CON = 1;
    protected int racial_ability_mod_WIS = 1;
    protected String racial_ability_01 = "See in the dark.";
    protected String racial_ability_02 = "Add level to mining checks.";
    protected String racial_ability_03 = "Add level to stone/metalwork checks.";
    protected String racial_ability_04 = "Add level to damage vs. orckind.";
    protected String race_equipment = "An axe; tools for mining, stone-working and metal-working.";

    // CONSTRUCTOR
    public Dwarf() {
    }

    // GETTERS
    @Override
    public String getRace_title() {
        return race_title;
    }

    @Override
    public int getRacial_ability_mod_CON() {
        return racial_ability_mod_CON;
    }

    @Override
    public int getRacial_ability_mod_WIS() {
        return racial_ability_mod_WIS;
    }

    @Override
    public String getRacial_ability_01(int level) { return racial_ability_01; }

    @Override
    public String getRacial_ability_02(int level) { return racial_ability_02; }

    @Override
    public String getRacial_ability_03(int level) { return racial_ability_03; }

    @Override
    public String getRacial_ability_04(int level) { return racial_ability_04; }

    @Override
    public String getRace_equipment() { return race_equipment; }


}   // END OF Dwarf class
