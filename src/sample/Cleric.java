package sample;

public class Cleric extends Character {

    // DECLARATIONS
    protected String class_title = "Cleric";
    protected int die_type = 6;
    protected int armor_type_mod = 2;                                           // A cleric wears Light armor (+2)
    protected boolean casts_spells = true;
    protected int class_ability_mod_WIS = 1;
    protected int class_ability_mod_CHR = 1;
    protected String class_equipment = "A heavy mace, light armor, robes and a holy symbol.";


    // CONSTRUCTOR
    public Cleric() {
    }

    // GETTERS
    @Override
    public String getClass_title() {
        return class_title;
    }

    @Override
    public int getDie_type() {
        return die_type;
    }

    @Override
    public int getArmor_type_mod() {
        return armor_type_mod;
    }

    @Override
    public boolean isCasts_spells() {
        return casts_spells;
    }

    @Override
    public int getClass_ability_mod_WIS() {
        return class_ability_mod_WIS;
    }

    @Override
    public int getClass_ability_mod_CHR() {
        return class_ability_mod_CHR;
    }

    @Override
    public String getClass_ability_01(int level) {
        return "Theme: Holy Magic (protects, guides and heals).";
    }

    @Override
    public String getClass_ability_02(int level) {
        return "Banish " + level + " undead of " + level + "d6 power, or";
    }

    @Override
    public String getClass_ability_03(int level) {
        return "  banish " + level + "d6 undead of up to power " + level + ".";
    }

    @Override
    public String getClass_equipment() { return class_equipment; }


    // METHODS
    @Override
    public int calculate_maximum_HP(int level, int mod_from_race) {
        return (level * die_type) + class_hp_mod + mod_from_race;
    }

    @Override
    public int calculate_baseAC(int level, int mod_from_race) {
        return armor_type_mod + class_AC_mod + mod_from_race;
    }

    @Override
    public int calculate_attack(int level, int mod_from_race) {
        return class_attack_mod + mod_from_race;
    }

    @Override
    public int calculate_damage(int level, int mod_from_race) {
        return class_damage_mod + mod_from_race;
    }

    @Override
    public int calculate_dicepool(int level, int mod_from_race) {
        return super.calculate_dicepool(level, mod_from_race);
    }


}   // END OF Cleric class

