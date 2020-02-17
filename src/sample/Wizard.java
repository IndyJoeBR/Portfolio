package sample;

public class Wizard extends Character {

    // DECLARATIONS
    protected String class_title = "Wizard";
    protected int armor_type_mod = 0;                                           // A wizard wears no armor (+0)
    protected int class_ability_mod_INT = 1;
    protected int die_type = 4;
    protected boolean casts_spells = true;
    protected String class_equipment = "A staff, robes and book of spells.";



    // CONSTRUCTOR
    public Wizard() {
    }

    // GETTERS
    @Override
    public String getClass_title() {
        return class_title;
    }

    @Override
    public int getArmor_type_mod() {
        return armor_type_mod;
    }

    @Override
    public int getClass_ability_mod_INT() {
        return class_ability_mod_INT;
    }

    @Override
    public int getDie_type() {
        return die_type;
    }

    @Override
    public boolean isCasts_spells() {
        return casts_spells;
    }

    @Override
    public String getClass_ability_01(int level) {
        return "Theme: High Magic (any effect, except healing).";
    }

    @Override
    public String getClass_ability_02(int level) {
        return "Add level ( +" + level + " ) to INT checks.";
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

    // Damage modifier
    public int calculate_damage(int level, int mod_from_race) {
        return class_damage_mod + mod_from_race;
    }

    @Override
    public int calculate_dicepool(int level, int mod_from_race) {
        return super.calculate_dicepool(level, mod_from_race);
    }


}   // END OF WIZARD CLASS
