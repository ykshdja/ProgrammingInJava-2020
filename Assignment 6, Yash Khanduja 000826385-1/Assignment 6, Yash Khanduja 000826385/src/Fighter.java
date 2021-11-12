/*
 * Fighter is a type of human that had most damaging power
 * @author  Yash Khanduja, 000826385
 *
 *
 */
package fakeworld;


public class Fighter extends fakeworld.Human {
    /**
     * Constructor
     * default
     *
     * */

    public Fighter(String name){

        super.name=name;
        super.strength=10;
        super.dexterity=10;
        super.armour=10;
        super.moxie=10;
        super.coins=10;
        super.health=10;
        this.enemy=null;
    }
    /**
     * Constructor
     * @param name of the fighter
     * @param strength of the fighter
     * @param dexterity of the fighter
     * @param armour of the fighter
     * @param moxie of the fighter
     * @param coins of the fighter
     * @param elf enemy of the fighter
     * @param health of the fighter
     */
    public Fighter(String name,int strength,int dexterity,int armour,int moxie,int coins,Elf elf,double health ){
        super.name=name;
        super.strength=strength;
        super.dexterity=dexterity;
        super.armour=armour;
        super.moxie=moxie;
        super.coins=coins;
        super.health=health;
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
        this.enemy=elf;
    }

    /**
     * Fighter attack is twice as compared to the other humanoid
     * @return damage caused by fighters attack
     */
    @Override
    public double attact(){
        return super.attact()*2;
    }


    /**
     *@return details of the fighter
     */
    @Override
    public String toString(){
        String details="***Fighter***";
        details+="\nName:"+super.name;
        details+="\nHealth:"+super.health;
        details+="\nStrength:"+super.strength;
        details+="\nDexterity:"+super.dexterity;
        details+="\nArmour:"+super.armour;
        details+="\nMoxie:"+super.moxie;
        details+="\nCoins:"+super.coins;
        if(super.isAlive()){
            details+="\nStatus: is alive";
        }else{
            details+="\nStatus: is dead";
        }
        return details;
    }
}
