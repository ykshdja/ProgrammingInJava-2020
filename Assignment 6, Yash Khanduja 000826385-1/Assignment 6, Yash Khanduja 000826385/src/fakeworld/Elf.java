/*
 * Elf is a type of humanoid that is enemy of human and is friend of hobbit.
 * @author  Yash Khanduja, 000826385
 *
 *
 */
package fakeworld;


public class Elf extends fakeworld.Humanoid {
    private String clan;
    private fakeworld.Hobbit friend;
    /**
     * Constructor
     * default
     *
     * */
    public Elf(String name){

        super.name=name;
        super.strength=10;
        super.dexterity=10;
        super.armour=10;
        super.moxie=10;
        super.coins=10;
        super.health=10;
        this.clan="Forest";
        this.friend=null;
    }


    /**
     * Constructor
     * @param name of the Elf
     * @param strength of the Elf
     * @param dexterity of the Elf
     * @param armour of the Elf
     * @param moxie of the Elf
     * @param coins of the Elf
     * @param friend hobbit of the Elf
     * @param health of the Elf
     */

    public Elf(String name, int strength, int dexterity, int armour, int moxie, int coins, String clan, fakeworld.Hobbit friend, double health ){
        super.name=name;
        super.strength=strength;
        super.dexterity=dexterity;
        super.armour=armour;
        super.moxie=moxie;
        super.coins=coins;
        super.health=health;
        this.clan=clan;
        this.friend=friend;
        //to set values in range to max 20
        if(this.strength>20){
            this.strength=20;
        }
        if(this.dexterity>20){
            this.dexterity=20;
        }
        if(this.armour>20){
            this.armour=20;
        }
        if(this.moxie>20){
            this.moxie=20;
        }
        if(this.health>20){
            this.health=20;
        }

        //to set value in range to min 1
        if(this.health<0){
            this.health=0;
        }
        if(this.strength<0){
            this.strength=0;
        }
        if(this.dexterity<0){
            this.dexterity=0;
        }
        if(this.armour<0){
            this.armour=0;
        }
        if(this.moxie<0){
            this.moxie=0;
        }
    }
    /**
     * Elf clan
     * @return clan of the Elf
     */
    public String getClan() {
        return clan;
    }
    /**
     * Elf's friend hobbit
     * @return Friend hobbit of the elf
     */
    public fakeworld.Hobbit getFriend() {
        return friend;
    }

    /**
     * Set elf's friend
     * @param friend hobbit
     */
    public void setFriend(fakeworld.Hobbit friend) {
        this.friend = friend;
    }


    /**
     *@return elf details
     */
    @Override
    public String toString(){
        String details="***Elf***";
        details+="\nName:"+super.name;
        details+="\nHealth:"+super.health;
        details+="\nStrength:"+super.strength;
        details+="\nDexterity:"+super.dexterity;
        details+="\nArmour:"+super.armour;
        details+="\nMoxie:"+super.moxie;
        details+="\nCoins:"+super.coins;
        details+="\nClan:"+this.clan;
        if(super.isAlive()){
            details+="\nStatus: is alive";
        }else{
            details+="\nStatus: is dead";
        }
        return details;
    }

}
