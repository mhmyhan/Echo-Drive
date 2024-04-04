package com.echodrive.game;

public class Room_ShieldGen extends Room {

    // Class Variables:

    private final int maxLevel = 5;
    private int shieldPower;
    /**
     * how much shield is regained per tick
     */
    private int shieldRechargeRate;
    /**
     * how much time between when the shield was last damaged and shield commencing recharge (in Seconds)
     */
    private int shieldRechargeTimer;

    // Constructors:

    /**
     * default constructor
     */
    protected Room_ShieldGen(int level, float fragility) {
        super(level, fragility);
        this.shieldPower = 5;
        this.shieldRechargeRate = 2;
        this.shieldRechargeTimer = 2;
    }

    // Methods:

    /**
     *
     */
    @Override
    protected void levelUp() {
        if (super.level++ > maxLevel) {
            level = maxLevel;
        } else {
            level++;
        }

    }

}
