package sample;

public abstract class Race {

    // ABSTRACT CLASS VARIABLES
    protected String race_title = "";                       // the name of the race (eg. Dwarf, Elf, Halfling, ect...)
    protected int racial_attack_mod = 0;                    // a direct modifier to attack from a racial ability
    protected int racial_damage_mod = 0;                    // a direct modifer to damage from a racial ability
    protected int racial_AC_mod = 0;                        // a direct modifier to AC from a racial ability
    protected int racial_hp_mod = 0;                        // a direct modifier to hit points from a racial ability
    protected int racial_dicepool_mod = 0;                  // a direct modifier to the dicepool from a class ability

    // Racial abilities: these abilities may only appear in text (eg. See in dark) while others appear in text, but are
    //     also be calculated into a  derived stat (eg Elf adds +1 to dicepool).
    protected String racial_ability_01 = "";
    protected String racial_ability_02 = "";
    protected String racial_ability_03 = "";
    protected String racial_ability_04 = "";

    // Class ability score modifiers - these are direct modifiers to the character's ability scores
    protected int racial_ability_mod_STR = 0;
    protected int racial_ability_mod_DEX = 0;
    protected int racial_ability_mod_CON = 0;
    protected int racial_ability_mod_INT = 0;
    protected int racial_ability_mod_WIS = 0;
    protected int racial_ability_mod_CHR = 0;

    // Equipment carried by character due to race
    protected String race_equipment = "";


    // GETTERS
    public String getRace_title() { return race_title; }
    public int getRacial_attack_mod() { return racial_attack_mod; }
    public int getRacial_damage_mod() { return racial_damage_mod; }
    public int getRacial_AC_mod() { return racial_AC_mod; }
    public int getRacial_hp_mod() { return racial_hp_mod; }
    public int getRacial_dicepool_mod() { return racial_dicepool_mod; }
    public String getRacial_ability_01(int level) {
        return racial_ability_01;
    }
    public String getRacial_ability_02(int level) {
        return racial_ability_02;
    }
    public String getRacial_ability_03(int level) {
        return racial_ability_03;
    }
    public String getRacial_ability_04(int level) {
        return racial_ability_04;
    }
    public int getRacial_ability_mod_STR() {
        return racial_ability_mod_STR;
    }
    public int getRacial_ability_mod_DEX() {
        return racial_ability_mod_DEX;
    }
    public int getRacial_ability_mod_CON() {
        return racial_ability_mod_CON;
    }
    public int getRacial_ability_mod_INT() {
        return racial_ability_mod_INT;
    }
    public int getRacial_ability_mod_WIS() {
        return racial_ability_mod_WIS;
    }
    public int getRacial_ability_mod_CHR() {
        return racial_ability_mod_CHR;
    }
    public String getRace_equipment() { return race_equipment; }

}   // END OF Race class
