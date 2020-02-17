package sample;

public class Thief extends Character {

    // DECLARATIONS
    protected String class_title = "Thief";
    protected int die_type = 4;
    protected int armor_type_mod = 2;                                           // A thief wears Light armor (+2)
    protected int class_ability_mod_DEX = 1;
    protected int class_ability_mod_INT = 1;
    protected String class_equipment = "A short sword, light armor and thieving tools.";


    // CONSTRUCTOR
    public Thief() {
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
    public int getClass_ability_mod_DEX() {
        return class_ability_mod_DEX;
    }

    @Override
    public int getClass_ability_mod_INT() {
        return class_ability_mod_INT;
    }

    @Override
    public String getClass_ability_01(int level) {
        return "Add level ( +" + level + " ) to thieving checks";
    }

    @Override
    public String getClass_ability_02(int level) {
        return "Add " + level + "d4 damage against unaware opponents.";
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


}   // END OF Thief class

