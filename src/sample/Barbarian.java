package sample;

public class Barbarian extends Character {

    // DECLARATIONS
    protected String class_title = "Barbarian";
    protected int armor_type_mod = 0;                                           // A barbarian wears no armor (+0)
    protected int class_ability_mod_STR = 2;

    protected String class_equipment = "A two-handed sword (+1 damage*), furs, but no armor.";


    // CONSTRUCTOR
    public Barbarian() {
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
    public int getClass_ability_mod_STR() {
        return class_ability_mod_STR;
    }

    @Override
    public int getClass_ability_mod_CON() {
        return class_ability_mod_CON;
    }

    @Override
    public String getClass_ability_01(int level) {
        return "* Add level ( +" + level + " ) to total hit points.";
    }

    @Override
    public String getClass_ability_02(int level) {
        return "* Add level ( +" + level + " ) to damage, when unarmored.";
    }

    @Override
    public String getClass_equipment() { return class_equipment; }


    // METHODS
    @Override
    public int calculate_maximum_HP(int level, int mod_from_race) {
        return (level * die_type) + class_hp_mod + mod_from_race + level;
    }

    @Override
    public int calculate_baseAC(int level, int mod_from_race) {
        return armor_type_mod + class_AC_mod + mod_from_race;
    }

    @Override
    public int calculate_attack(int level, int mod_from_race) {
        return class_attack_mod + mod_from_race + level;
    }

    @Override
    public int calculate_damage(int level, int mod_from_race) {
        return class_damage_mod + mod_from_race + level +1;
    }

    @Override
    public int calculate_dicepool(int level, int mod_from_race) {
        return super.calculate_dicepool(level, mod_from_race);
    }


}   // END OF Fighter class

