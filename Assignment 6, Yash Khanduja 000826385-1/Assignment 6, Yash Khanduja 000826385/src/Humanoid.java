/*
 * The base class of all the humanoids
 */
package fakeworld;

public abstract class Humanoid {
    //name of the humanoid
    protected String name;
    //humanoid's strength
    protected int strength;
    // dexterity of the humanoid(skill in performing tasks)
    protected int dexterity;
    // armour of the humanoid
    protected int armour;
    // force of the humanoid
    protected int moxie;
    // coins the humanoids has
    protected int coins;
    //humanoids health
    protected double health;


    /**
     * Attack of the humanoid
     * @retun damage value
     */
    public double attact(){
        double avg=(strength+dexterity+health)/3;
        return avg;
    }
    /**
     * Damage taken by the humanoid being attacked
     * @param damage value
     */
    public void damage(double damage){
        if(damage>0){
            this.health-=damage/armour;
        }
    }

    /**
     * Increase health
     * @param val by health is to be increased
     */

    public void increaseHealth(double val){
        if(this.isAlive()){
            if(this.health+val<20){
                this.health+=val;
            }
        }
    }


    /**
     * Humanoid's life status
     * @retun true if humanoid is alive else false
     */
    public boolean isAlive(){
        if(this.health>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Increase humanoid strength by 1
     */
    public void increaseStrength(){
        if(this.isAlive()){
            if((this.strength+1)<20){
                this.strength+=1;
            }
        }
    }
    /**
     * Increase humanoid Dexterity by 1
     */
    public void increaseDexterity(){
        if(this.isAlive()){
            if((this.dexterity+1)<20){
                this.dexterity+=1;
            }
        }
    }
    /**
     * Increase humanoid Armour by 1
     */
    public void increaseArmour(){
        if(this.isAlive()){
            if((this.armour+1)<20){
                this.armour+=1;
            }
        }
    }
    /**
     * Increase humanoid Moxie by 1
     */
    public void increaseMoxie(){
        if(this.isAlive()){
            if((this.moxie+1)<20){
                this.moxie+=1;
            }
        }
    }
    /**
     * Increase humanoid coins score amount
     * @param amount to be increased
     */
    public void increaseCoins(int amount){
        if(this.isAlive()){
            this.coins+=amount;
        }
    }
    /**
     * Decrease humanoid coins score amount
     * @param amount to be decreased
     */
    public void decreaseCoins(int amount){
        this.coins-=amount;
    }

    /**
     * decrease humanoid strength
     */
    public void decreaseStrength(){
        if(this.isAlive()){
            if((this.strength-1)>0){
                this.strength-=1;
            }
        }
    }

    /**
     * decrease humanoid dexterity
     */
    public void decreaseDexterity(){
        if(this.isAlive()){
            if((this.dexterity-1)>0){
                this.dexterity-=1;
            }
        }
    }

    /**
     * decrease humanoid armour
     */
    public void decreaseArmour(){
        if(this.isAlive()){
            if((this.armour-1)>0){
                this.armour-=1;
            }
        }
    }
    /**
     * decrease humanoid moxie
     */
    public void decreaseMoxie(){
        if(this.isAlive()){
            if((this.moxie-1)>0){
                this.moxie-=1;
            }
        }
    }

    //getter methods for the attributes
    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getArmour() {
        return armour;
    }

    public int getMoxie() {
        return moxie;
    }

    public int getCoins() {
        return coins;
    }

    public double getHealth() {
        return health;
    }



}
