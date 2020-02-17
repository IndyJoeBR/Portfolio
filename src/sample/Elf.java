package sample;

public class Elf extends Race {

    // DECLARATIONS
    protected String race_title = "Elf";
    protected int racial_dicepool_mod = 1;
    protected int racial_ability_mod_DEX = 1;
    protected int racial_ability_mod_INT = 1;
    protected String racial_ability_01 = "See in the dark.";
    protected String racial_ability_02 = "Add level to detection checks.";
    protected String racial_ability_03 = "*Bonus die to magic pool if spellcaster.";
    protected String race_equipment = "Bow (long range) and a light cloak.";


    // CONSTRUCTOR
    public Elf() {
    }

    // GETTERS
    @Override
    public String getRace_title() {
        return race_title;
    }

    @Override
    public int getRacial_dicepool_mod() {
        return racial_dicepool_mod;
    }

    @Override
    public int getRacial_ability_mod_DEX() {
        return racial_ability_mod_DEX;
    }

    @Override
    public int getRacial_ability_mod_INT() {
        return racial_ability_mod_INT;
    }

    @Override
    public String getRacial_ability_01(int level) { return racial_ability_01; }

    @Override
    public String getRacial_ability_02(int level) { return racial_ability_02; }

    @Override
    public String getRacial_ability_03(int level) { return racial_ability_03; }

    @Override
    public String getRace_equipment() { return race_equipment; }


}   // END OF Elf class

