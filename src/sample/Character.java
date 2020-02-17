package sample;

public abstract class Character {

    // ABSTRACT CLASS VARIABLES
    protected String class_title = "";                      // the name of the class (eg. Fighter, Cleric, Rogue, ect...)
    protected int die_type = 8;                             // the class die used for most rolls (8 is the most common)
    protected boolean casts_spells = false;                 // can the class cast spells (most cannot)

    // Class Attack
    protected int attack_mod_total = 0;                     // method derived attack bonus of the character
    protected int class_attack_mod = 0;                     // a direct modifier to attack from a class ability
    protected int class_damage_mod = 0;                     // a direct modifier to damage done from a class ability

    // Class AC
    protected int armor_class_total = 0;                    // method derived AC of the character
    protected int armor_type_mod = 0;                       // modifier from the armor worn by the class
    protected int class_AC_mod = 0;                         // a direct modifier to AC from a class ability

    // Class HP
    protected int hit_points_max_total = 0;                 // method derived hit points of the character (maximum hit points)
    protected int class_hp_mod = 0;                         // a direct modifier to hit points from a class ability

    // Class Dicepool
    protected int dicepool_total = 0;                       // method derived dicepool total of the character
    protected int class_dicepool_mod = 0;                   // a direct modifier to the dicepool from a class ability

    // Class abilities: these are class abilities; some are only text (eg. High magic) others appear in text, but may
    //     also appear in the text of an ability as well as in a derived stat (eg Fighter adds class level to attack
    //     which is calculated in the Fighter classes calculate_attack_bonus method)
    protected String class_ability_01 = "";
    protected String class_ability_02 = "";
    protected String class_ability_03 = "";
    protected String class_ability_04 = "";

    // Class ability score modifiers - these are direct modifiers to the character's ability scores
    protected int class_ability_mod_STR = 0;
    protected int class_ability_mod_DEX = 0;
    protected int class_ability_mod_CON = 0;
    protected int class_ability_mod_INT = 0;
    protected int class_ability_mod_WIS = 0;
    protected int class_ability_mod_CHR = 0;

    // Equipment carried by character due to class
    protected String class_equipment = "";


    // GETTERS & SETTERS

    public String getClass_title() {
        return class_title;
    }

    public void setClass_title(String class_title) {
        this.class_title = class_title;
    }

    public int getDie_type() {
        return die_type;
    }

    public void setDie_type(int die_type) {
        this.die_type = die_type;
    }

    public boolean isCasts_spells() {
        return casts_spells;
    }

    public void setCasts_spells(boolean casts_spells) {
        this.casts_spells = casts_spells;
    }

    public int getAttack_mod_total() {
        return attack_mod_total;
    }

    public void setAttack_mod_total(int attack_mod_total) {
        this.attack_mod_total = attack_mod_total;
    }

    public int getClass_attack_mod() {
        return class_attack_mod;
    }

    public void setClass_attack_mod(int class_attack_mod) {
        this.class_attack_mod = class_attack_mod;
    }

    public int getArmor_class_total() {
        return armor_class_total;
    }

    public void setArmor_class_total(int armor_class_total) {
        this.armor_class_total = armor_class_total;
    }

    public int getArmor_type_mod() {
        return armor_type_mod;
    }

    public void setArmor_type_mod(int armor_type_mod) {
        this.armor_type_mod = armor_type_mod;
    }

    public int getClass_AC_mod() {
        return class_AC_mod;
    }

    public void setClass_AC_mod(int class_AC_mod) {
        this.class_AC_mod = class_AC_mod;
    }

    public int getHit_points_max_total() {
        return hit_points_max_total;
    }

    public void setHit_points_max_total(int hit_points_max_total) {
        this.hit_points_max_total = hit_points_max_total;
    }

    public int getClass_hp_mod() {
        return class_hp_mod;
    }

    public void setClass_hp_mod(int class_hp_mod) {
        this.class_hp_mod = class_hp_mod;
    }

    public int getDicepool_total() {
        return dicepool_total;
    }

    public void setDicepool_total(int dicepool_total) {
        this.dicepool_total = dicepool_total;
    }

    public int getClass_dicepool_mod() {
        return class_dicepool_mod;
    }

    public void setClass_dicepool_mod(int class_dicepool_mod) {
        this.class_dicepool_mod = class_dicepool_mod;
    }

    public String getClass_ability_01(int level) {
        return class_ability_01;
    }

    public void setClass_ability_01(String class_ability_01) {
        this.class_ability_01 = class_ability_01;
    }

    public String getClass_ability_02(int level) {
        return class_ability_02;
    }

    public void setClass_ability_02(String class_ability_02) {
        this.class_ability_02 = class_ability_02;
    }

    public String getClass_ability_03(int level) {
        return class_ability_03;
    }

    public void setClass_ability_03(String class_ability_03) {
        this.class_ability_03 = class_ability_03;
    }

    public String getClass_ability_04(int level) {
        return class_ability_04;
    }

    public void setClass_ability_04(String class_ability_04) {
        this.class_ability_04 = class_ability_04;
    }

    public int getClass_ability_mod_STR() {
        return class_ability_mod_STR;
    }

    public void setClass_ability_mod_STR(int class_ability_mod_STR) {
        this.class_ability_mod_STR = class_ability_mod_STR;
    }

    public int getClass_ability_mod_DEX() {
        return class_ability_mod_DEX;
    }

    public void setClass_ability_mod_DEX(int class_ability_mod_DEX) {
        this.class_ability_mod_DEX = class_ability_mod_DEX;
    }

    public int getClass_ability_mod_CON() {
        return class_ability_mod_CON;
    }

    public void setClass_ability_mod_CON(int class_ability_mod_CON) {
        this.class_ability_mod_CON = class_ability_mod_CON;
    }

    public int getClass_ability_mod_INT() {
        return class_ability_mod_INT;
    }

    public void setClass_ability_mod_INT(int class_ability_mod_INT) {
        this.class_ability_mod_INT = class_ability_mod_INT;
    }

    public int getClass_ability_mod_WIS() {
        return class_ability_mod_WIS;
    }

    public void setClass_ability_mod_WIS(int class_ability_mod_WIS) {
        this.class_ability_mod_WIS = class_ability_mod_WIS;
    }

    public int getClass_ability_mod_CHR() {
        return class_ability_mod_CHR;
    }

    public void setClass_ability_mod_CHR(int class_ability_mod_CHR) {
        this.class_ability_mod_CHR = class_ability_mod_CHR;
    }

    public int getClass_damage_mod() { return class_damage_mod; }

    public void setClass_damage_mod(int class_damage_mod) { this.class_damage_mod = class_damage_mod; }

    public String getClass_equipment() { return class_equipment; }

    public void setClass_equipment(String class_equipment) { this.class_equipment = class_equipment; }


    // ABSTRACT METHODS

    // Maximum hit points
    public int calculate_maximum_HP(int level, int mod_from_race) {
        return (level * die_type) + class_hp_mod + mod_from_race;
     }

    // Armor Class
    public int calculate_baseAC(int level, int mod_from_race) {
        return armor_type_mod + class_AC_mod + mod_from_race;
    }

    // Attack modifier
    public int calculate_attack(int level, int mod_from_race) {
        return class_attack_mod + mod_from_race;
    }

    // Damage modifier
    public int calculate_damage(int level, int mod_from_race) {
        return class_damage_mod + mod_from_race;
    }

    // Magic Dicepool
    public int calculate_dicepool(int level, int mod_from_race) {
        return 1 + level + class_dicepool_mod + mod_from_race;
    }





}   // END OF Character class

