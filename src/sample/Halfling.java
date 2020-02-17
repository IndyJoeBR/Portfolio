package sample;

public class Halfling extends Race {

    // DECLARATIONS
    protected String race_title = "Halfing";
    protected int racial_ability_mod_DEX = 1;
    protected int racial_ability_mod_WIS = 1;
    protected int racial_damage_mod = (-1);                    // Their smaller weapons cause less damage
    protected int racial_AC_mod = 1;
    protected String racial_ability_01 = "See in the dark.";
    protected String racial_ability_02 = "Add level to stealth checks.";
    protected String racial_ability_03 = "* Bonus +1 to AC.";
    protected String racial_ability_04 = "* -1 to all damage rolls.";
    protected String race_equipment = "Sling (short range), bullets and a light cloak.";

    // CONSTRUCTOR
    public Halfling() {
    }

    // GETTERS


    @Override
    public String getRace_title() {
        return race_title;
    }

    @Override
    public int getRacial_AC_mod() { return racial_AC_mod; }

    public int getRacial_damage_mod() { return racial_damage_mod; }

    @Override
    public int getRacial_ability_mod_DEX() {
        return racial_ability_mod_DEX;
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



}   // END OF HALFLING CLASS

