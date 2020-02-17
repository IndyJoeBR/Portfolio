//  Programmer: Joseph Benson
//  Program: Semester Project for SDEV200
//  Version & Date:  v01 18 Dec 2019
//  This RPG character sheet is based upon the 1 Pot RPG designed by Duncan Young in 2013.  The character sheet is intended
//  as both the character sheet and the entire set of rules.  The game itself is a simplified version of the 1st edition of
//  Dungeons & Dragons.  I believe it is best used as either an extremely easy introduction to how to play a roleplaying
//  game as character generation can take under 1 minutes easy.  Or, if everybody has a laptop and the JVM, an easy way
//  for a group to quickly jump into a one session game.  It is designed for ROLE playing, not as a rule heavy, deep RPG.
//
//  The game is straightforward enough for anybody familiar with D&D.
//  1)  Generate a stat block and, once happy with it, lock it.  (So you don't accidentally generate a new one.)
//  2)  Pick a race and a class.
//  3)  Give your character a name.
//  4)  If the game starts at a higher level, click up to that.  (Increase your hit points to the maximum.)
//  You are ready to play.
//  You attack by meeting or exceeding an opponents Armor Class on a 1d20 roll.  Some PCs may receive a bonus to attack.
//  Your damage and any bonus to damage is also noted.  An actual roll of 1 always misses.  20 always succeeds.
//  You roll a d20 when trying any kind of skilled maneuver, the themes for which are found under the ability scores across
//    the top of the character sheet.  You must roll equal to or under that number to succeed.
//  Your saving throws... that is avoiding some kind of an effect work the exact same.  Those are found below the skills.
//  Magic is a little trickier.  You have a dice pool from which you will build a spell.  Talk to the person running the
//    game to figure it out.  If you are a spellcaster, you the number of spells you receive a day is noted as well as
//    how many are in your pool and what kind of die to use.
//  All the dice you need are located at the bottom of the screen.  Choose how many to roll, click on a die and you will
//    receive a total.
//  The tally for the experience you receive in your adventures is noted next to the dice.  In theory you gain a new level
//    at 1000 * current-level.  (Level 2 is achieved at 1000xp.
//  And finally... each class and race has some special abilities and equipment.
//
//  What is missing?  5 character classes and monsters.  Gold.  And an equipment system.
//
//  Enjoy!

package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Controller {

    // ComboBox lists for pc races and classes
    ObservableList<String> characterRacesList = FXCollections.observableArrayList("Dwarf", "Elf", "Halfling", "Human");
    ObservableList<String> characterClassesList = FXCollections.observableArrayList("Barbarian", "Cleric", "Fighter", "Thief", "Wizard");


    // DECLARATION FOR GUI (BUTTONS, LABELS AND TEXT FIELDS)
    @FXML private BorderPane mainBorderPane_fxid;
    @FXML private Button rollD20_button_fxid;
    @FXML private Button rollD6_button_fxid;
    @FXML private Label class_ability_02_display_label_fxid;
    @FXML private Label d20_results_display_label_fxid;
    @FXML private Label dicepool_display_label_fxid;
    @FXML private Button rollD4_button_fxid;
    @FXML private Label XP_total_label_fxid;
    @FXML private Label generated_WIS_display_label_fxid;
    @FXML private Label INT_display_label_fxid;
    @FXML private Label WIS_display_label_fxid;
    @FXML private Label STR_display_label_fxid;
    @FXML private Text spellcasting_explanation_fxid;
    @FXML private Button rollD8_button_fxid;
    @FXML private Label CHR_display_label_fxid;
    @FXML private Label generated_DEX_display_label_fxid;
    @FXML private Button xp_add_button_fxid;
    @FXML private Button xp_remove_button_fxid;
    @FXML private Label dice_being_rolled_textfield_fxid;
    @FXML private CheckBox lock_stats_chk_fxid;
    @FXML private Button hp_add_button_fxid;
    @FXML private Label HP_display_label_fxid;
    @FXML private Button generate_stat_block_button_fxid;
    @FXML private Label d12_results_display_label_fxid;
    @FXML private Button level_add_button_fxid;
    @FXML private Label DEX_display_label_fxid;
    @FXML private Label attack_display_label_fxid;
    @FXML private TextField character_name_textfield_fxid;
    @FXML private Label class_level_display_label_fxid;
    @FXML private Button rollD10_button_fxid;
    @FXML private Label class_ability_01_display_label_fxid;
    @FXML private Button rollD12_button_fxid;
    @FXML private Label generated_CON_display_label_fxid;
    @FXML private Button qtyDice_add_button_fxid;
    @FXML private Label d4_results_display_label_fxid;
    @FXML private Label generated_CHR_display_label_fxid;
    @FXML private Button rollD100_button_fxid;
    @FXML private Label generated_INT_display_label_fxid;
    @FXML private Label d10_results_display_label_fxid;
    @FXML private Label generated_STR_display_label_fxid;
    @FXML private Button qtyDice_remove_button_fxid;
    @FXML private Button level_remove_button_fxid;
    @FXML private Label d8_results_display_label_fxid;
    @FXML private Label racial_ability_03_display_label_fxid;
    @FXML private Label racial_ability_04_display_label_fxid;
    @FXML private Label racial_ability_02_display_label_fxid;
    @FXML private Label CON_display_label_fxid;
    @FXML private Label racial_ability_01_display_label_fxid;
    @FXML private Label race_chosen_display_label_fxid;
    @FXML private Label d6_results_display_label_fxid;
    @FXML private Label class_ability_03_display_label_fxid;
    @FXML private Label class_ability_04_display_label_fxid;
    @FXML private Label AC_display_label_fxid;
    @FXML private Label spells_per_day_fxid;
    @FXML private Label testing_field_fxid;
    @FXML private ComboBox choose_race_combobox_fxid;
    @FXML private ComboBox choose_class_combobox_fxid;
    @FXML private Label d100_results_display_label_fxid;
    @FXML private Label class_equipment_display_label_fxid;
    @FXML private Label racial_equipment_display_label_fxid;


    //  The Character
    public Character pc = new Fighter();                    // TODO Create spinner to choose class
    public Race race = new Dwarf();                         // TODO Create spinner to choose race
    public boolean abilityScoresAreLocked = false;
    private int class_die = pc.getDie_type();

    // Variables which can be increased or decreased
    public int xpTotal = 0;
    public int levelTotal = 1;
    public int maximumHP = pc.calculate_maximum_HP(levelTotal, race.getRacial_hp_mod());
    public int currentHP = 4;                                                                       // 4 is the minimum starting hp of a new character
    private int baseAC = pc.calculate_baseAC(levelTotal,race.getRacial_AC_mod());
    private int dicepoolTotal = pc.calculate_dicepool(levelTotal,race.getRacial_dicepool_mod());

    // Ability Score variables
    private int generated_STR = 10;
    private int generated_DEX = 10;
    private int generated_CON = 10;
    private int generated_INT = 10;
    private int generated_WIS = 10;
    private int generated_CHR = 10;

    public int ability_score_total_STR = generated_STR + pc.getClass_ability_mod_STR() + race.getRacial_ability_mod_STR();
    public int ability_score_total_DEX = generated_DEX + pc.getClass_ability_mod_DEX() + race.getRacial_ability_mod_DEX();
    public int ability_score_total_CON = generated_CON + pc.getClass_ability_mod_CON() + race.getRacial_ability_mod_CON();
    public int ability_score_total_INT = generated_INT + pc.getClass_ability_mod_INT() + race.getRacial_ability_mod_INT();
    public int ability_score_total_WIS = generated_WIS + pc.getClass_ability_mod_WIS() + race.getRacial_ability_mod_WIS();
    public int ability_score_total_CHR = generated_CHR + pc.getClass_ability_mod_CHR() + race.getRacial_ability_mod_CHR();


    // Die rolling variables
    // declare DiceTotals
    int d4RollTotal;
    int d6RollTotal;
    int d8RollTotal;
    int d10RollTotal;
    int d12RollTotal;
    int d20RollTotal;
    int d100RollTotal;
    private int qtyOfDiceToRoll = 1;            // The number of dice rolled when a die-button is clicked
    Random randomRoll = new Random();           // Creates the random object which will return a pseudorandom number

    // Initalize Method
    @FXML
    private void initialize() {
        choose_race_combobox_fxid.setValue("Dwarf");
        choose_race_combobox_fxid.setItems(characterRacesList);

        choose_class_combobox_fxid.setValue("Fighter");
        choose_class_combobox_fxid.setItems(characterClassesList);
    }


    // Choose race and class
    @FXML
    void race_chosen(ActionEvent event) {
        String race_name = (String) choose_race_combobox_fxid.getValue();

        if(race_name.equals("Dwarf")) {
            race = new Dwarf();
            updateEverything();
        }
        else if (race_name.equals("Elf")) {
            race = new Elf();
            updateEverything();
        }
        else if (race_name.equals("Halfling")) {
            race = new Halfling();
            updateEverything();
        }
        else {
            race = new Human();
            updateEverything();
        }
    }   // END race_chosen method


    @FXML
    void class_chosen(ActionEvent event) {
        String class_name = (String) choose_class_combobox_fxid.getValue();

        if(class_name.equals("Barbarian")) {
            pc = new Barbarian();
            updateEverything();
        }
        else if(class_name.equals("Cleric")) {
            pc = new Cleric();
            updateEverything();
        }
        else if(class_name.equals("Thief")) {
            pc = new Thief();
            updateEverything();
        }
        else if(class_name.equals("Wizard")) {
            pc = new Wizard();
            updateEverything();
        }
        else {
            pc = new Fighter();
            updateEverything();
        }

    }   // END class_chosen method



    // onClicks for Dice
    @FXML
    void increaseDiceRolled(ActionEvent event) {
        qtyOfDiceToRoll = qtyOfDiceToRoll + 1;
        dice_being_rolled_textfield_fxid.setText("x" + qtyOfDiceToRoll);
    }
    @FXML
    void decreaseDiceRolled(ActionEvent event) {
        qtyOfDiceToRoll = max(qtyOfDiceToRoll - 1, 1);
        dice_being_rolled_textfield_fxid.setText("x" + qtyOfDiceToRoll);
    }
    @FXML                                               // onClick of d4 roll button
    void rollD4(ActionEvent event) {
        d4RollTotal = rollTheBones(qtyOfDiceToRoll, 4);
        d4_results_display_label_fxid.setText(Integer.toString(d4RollTotal));
    }
    @FXML                                               // onClick of d6 roll button
    void rollD6(ActionEvent event) {
        d6RollTotal = rollTheBones(qtyOfDiceToRoll, 6);
        d6_results_display_label_fxid.setText(Integer.toString(d6RollTotal));
    }
    @FXML                                               // onClick of d8 roll button
    void rollD8(ActionEvent event) {
        d8RollTotal = rollTheBones(qtyOfDiceToRoll, 8);
        d8_results_display_label_fxid.setText(""+d8RollTotal);
    }
    @FXML                                               // onClick of d10 roll button
    void rollD10(ActionEvent event) {
        d10RollTotal = rollTheBones(qtyOfDiceToRoll, 10);
        d10_results_display_label_fxid.setText(""+d10RollTotal);
    }
    @FXML                                               // onClick of d12 roll button
    void rollD12(ActionEvent event) {
        d12RollTotal = rollTheBones(qtyOfDiceToRoll, 12);
        d12_results_display_label_fxid.setText(""+d12RollTotal);
    }
    @FXML                                               // onClick of d20 roll button
    void rollD20(ActionEvent event) {
        d20RollTotal = rollTheBones(1, 20);
        d20_results_display_label_fxid.setText(""+d20RollTotal);
    }
    @FXML                                               // onClick of d100 roll button
    void rollD100(ActionEvent event) {
        d100RollTotal = rollTheBones(1, 100);
        d100_results_display_label_fxid.setText(""+d100RollTotal);
    }


    // Change XP (eXperience Points)
    @FXML
    void increaseXP(ActionEvent event) {
        xpTotal = xpTotal + 1;
        XP_total_label_fxid.setText(Integer.toString(xpTotal));
    }
    @FXML
    void decreaseXP(ActionEvent event) {
        xpTotal = max(xpTotal - 1, 0);
        XP_total_label_fxid.setText(Integer.toString(xpTotal));
    }


    //  Change CURRENT Hit Points (not Maximum)
    @FXML
    void increaseHP(ActionEvent event) {
        currentHP = min(currentHP + 1, maximumHP);
        HP_display_label_fxid.setText(Integer.toString(currentHP));
        updateLevelableFields();
    }
    @FXML
    void decreaseHP(ActionEvent event) {
        currentHP = max(currentHP - 1, 0);
        HP_display_label_fxid.setText(Integer.toString(currentHP));
        updateLevelableFields();
    }

    //  Change Level
    @FXML
    void increaseLevel(ActionEvent event) {
        levelTotal = levelTotal + 1;
        class_level_display_label_fxid.setText(Integer.toString(levelTotal));
        updateLevelableFields();
    }
    @FXML
    void decreaseLevel(ActionEvent event) {
        levelTotal = max(levelTotal - 1, 1);
        class_level_display_label_fxid.setText(Integer.toString(levelTotal));
        updateLevelableFields();
    }

    @FXML
    void lockAbilityScores(ActionEvent event) {
        if(lock_stats_chk_fxid.isSelected()) {
            abilityScoresAreLocked = true;
            testing_field_fxid.setText("Ability Scores LOCKED");
        }
        else {
            abilityScoresAreLocked = false;
            testing_field_fxid.setText("Ability Scores UNLOCKED");
        }
    }


    @FXML
    void randomlyGenerateStatBlock(ActionEvent event) {
        // GENERATE STATS
        if(abilityScoresAreLocked)
            testing_field_fxid.setText("Cannot roll new stats - LOCKED");                       // Warning to user
        else {
            testing_field_fxid.setText("Rolling new stat block!");
            generated_STR = rollTheBones(3, 6);
            generated_DEX = rollTheBones(3, 6);
            generated_CON = rollTheBones(3, 6);
            generated_INT = rollTheBones(3, 6);
            generated_WIS = rollTheBones(3, 6);
            generated_CHR = rollTheBones(3, 6);

            generated_STR_display_label_fxid.setText(Integer.toString(generated_STR));
            generated_DEX_display_label_fxid.setText(Integer.toString(generated_DEX));
            generated_CON_display_label_fxid.setText(Integer.toString(generated_CON));
            generated_INT_display_label_fxid.setText(Integer.toString(generated_INT));
            generated_WIS_display_label_fxid.setText(Integer.toString(generated_WIS));
            generated_CHR_display_label_fxid.setText(Integer.toString(generated_CHR));

            updateEverything();
            updateLevelableFields();
        }

    }


    // Update variables and fields which may change with level
    public void updateLevelableFields () {
        int pc_attack_bonus = pc.calculate_attack(levelTotal, race.getRacial_attack_mod());

        int pc_damage_bonus = pc.calculate_damage(levelTotal, race.getRacial_damage_mod());
        String pc_damage_bonus_string;
        if(pc_damage_bonus < 0) {
            pc_damage_bonus_string = " " + pc_damage_bonus;
        }
        else {
            pc_damage_bonus_string = " +" + pc_damage_bonus;
        }
        testing_field_fxid.setText("damage bonus: " + race.getRacial_damage_mod());                     // REMOVE

        attack_display_label_fxid.setText("+" + pc_attack_bonus + " / 1d" + class_die + " " + pc_damage_bonus_string);

        if (pc.isCasts_spells()) {
            dicepoolTotal = pc.calculate_dicepool(levelTotal, race.getRacial_dicepool_mod());            // Recalculates
            dicepool_display_label_fxid.setText("" + dicepoolTotal + "d" + class_die);
            spellcasting_explanation_fxid.setText("Spells can have any effect of the listed theme.  They can effect up to " + levelTotal + " target(s) with " + dicepoolTotal + "d" + class_die +
                    " of power OR 1" + "d" + class_die + " targets with a power of " + levelTotal + ".  Other effects can be achieved by reducing the size of the dicepool.  Range: self " +
                    "/ touch / immediate, 0 die; short, -1 die; long, -2 die; far, -5 die.  Duration: instant, 0 die; short, -1 die; long, -3 die; forever, -5 die.  Mental control: -1 die. " +
                    "Summoning: -3 die.  Death: -5 die.");
            spells_per_day_fxid.setText("" + levelTotal + " spell(s)/day");
        } else {
            dicepool_display_label_fxid.setText("Non-caster");
            spells_per_day_fxid.setText("");
            spellcasting_explanation_fxid.setText("Non-caster");
        }

        AC_display_label_fxid.setText(Integer.toString(baseAC + ability_score_total_DEX));

        maximumHP = pc.calculate_maximum_HP(levelTotal, race.getRacial_hp_mod());                   // Recalculates
        HP_display_label_fxid.setText("" + currentHP + " / " + maximumHP);
    }

    public void updateEverything() {
        // Ability Scores
        ability_score_total_STR = generated_STR + pc.getClass_ability_mod_STR() + race.getRacial_ability_mod_STR();
        ability_score_total_DEX = generated_DEX + pc.getClass_ability_mod_DEX() + race.getRacial_ability_mod_DEX();
        ability_score_total_CON = generated_CON + pc.getClass_ability_mod_CON() + race.getRacial_ability_mod_CON();
        ability_score_total_INT = generated_INT + pc.getClass_ability_mod_INT() + race.getRacial_ability_mod_INT();
        ability_score_total_WIS = generated_WIS + pc.getClass_ability_mod_WIS() + race.getRacial_ability_mod_WIS();
        ability_score_total_CHR = generated_CHR + pc.getClass_ability_mod_CHR() + race.getRacial_ability_mod_CHR();

        STR_display_label_fxid.setText(Integer.toString(ability_score_total_STR));
        DEX_display_label_fxid.setText(Integer.toString(ability_score_total_DEX));
        CON_display_label_fxid.setText(Integer.toString(ability_score_total_CON));
        INT_display_label_fxid.setText(Integer.toString(ability_score_total_INT));
        WIS_display_label_fxid.setText(Integer.toString(ability_score_total_WIS));
        CHR_display_label_fxid.setText(Integer.toString(ability_score_total_CHR));

        // Race & Class
        class_ability_01_display_label_fxid.setText(pc.getClass_ability_01(levelTotal));
        class_ability_02_display_label_fxid.setText(pc.getClass_ability_02(levelTotal));
        class_ability_03_display_label_fxid.setText(pc.getClass_ability_03(levelTotal));
        class_ability_04_display_label_fxid.setText(pc.getClass_ability_04(levelTotal));

        racial_ability_01_display_label_fxid.setText(race.getRacial_ability_01(levelTotal));
        racial_ability_02_display_label_fxid.setText(race.getRacial_ability_02(levelTotal));
        racial_ability_03_display_label_fxid.setText(race.getRacial_ability_03(levelTotal));
        racial_ability_04_display_label_fxid.setText(race.getRacial_ability_04(levelTotal));

        class_equipment_display_label_fxid.setText(pc.getClass_equipment());
        racial_equipment_display_label_fxid.setText(race.getRace_equipment());


        class_die = pc.getDie_type();
        maximumHP = pc.calculate_maximum_HP(levelTotal, race.getRacial_hp_mod());
        baseAC = pc.calculate_baseAC(levelTotal,race.getRacial_AC_mod());
        dicepoolTotal = pc.calculate_dicepool(levelTotal,race.getRacial_dicepool_mod());


        updateLevelableFields();

    }   // END OF UPDATEEVERYTHING METHOD


    // DICE ROLLING METHOD
    // Method used to roll the dice
    public int rollTheBones(int numberToRoll, int dieType) {
        int diceTotal = 0;
        int randomNumber;
        for(int i = 1; i <= numberToRoll; i++) {                        // FOR loop to roll the die the number of times required
            randomNumber = randomRoll.nextInt(dieType) + 1;             // Rolls a random number of the die type chosen and adds +1 to get 1-to-dieType
            diceTotal = diceTotal + randomNumber;                       // Running total of the dice rolled
        }
        return diceTotal;                                               // Returns the total from the dice rolled to the calling method
    }



}   //  END OF CONTROLLER CLASS

