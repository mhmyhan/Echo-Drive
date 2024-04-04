package com.echodrive.game;

public class Room {

    // Class Variables:

    /**
     * defines the level of and by extension the effectiveness of the room's function between 1 - 5
     */
    protected int level;
    /**
     * Multiplier for damage dealt to the room
     */
    private float fragility;

    // Constructors:

    /**
     * default constructor
     */
    protected Room() {

        this.level = 1;
        this.fragility = 1.00f;

    }

    /**
     * constructor with all parameters manually defined
     * @param level defines the selected level of the room in question
     * @param fragility defines the
     */
    protected Room(int level,
                   float fragility) {
        this.level = level;
        this.fragility = fragility;
    }

    // Methods:

    /**
     * Increases the level of the room by 1
     */
    protected void levelUp() {
        level++;
    }

    /**
     *
     * @param levels how many levels to be increased by
     */
    public void levelUp(int levels) {
        level += levels;
    }

}
