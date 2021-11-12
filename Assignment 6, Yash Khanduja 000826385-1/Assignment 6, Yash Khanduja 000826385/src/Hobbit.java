/*
 * Hobbit is a type of humanoid that is friend of elf and does stealing
 * @author  Yash Khanduja, 000826385
 *
 *
 */
package fakeworld;


public class Hobbit extends fakeworld.Humanoid {

    /**
     * Constructor
     * default
     *
     * */
    public Hobbit(String name){

        super.name=name;
        super.strength=10;
        super.dexterity=10;
        super.armour=10;
        super.moxie=10;
        super.coins=10;
        super.health=10;
    }


    /**
     * Constructor
     * @param name of the hobbit
     * @param strength of the hobbit
     * @param dexterity of the hobbit
     * @param armour of the hobbit
     * @param moxie of the hobbit
     * @param coins of the hobbit
     * @param health of the hobbit
     */
    public Hobbit(String name,int strength,int dexterity,int armour,int moxie,int coins,double health ){
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

    }

    /**
     * Steal value score of hobbit
     * @return steal score
     */
    public double steal(){
        if(this.dexterity>0){
            return this.dexterity/2;
        }
        else{
            return 0;
        }
    }
    /**
     *@return hobbit details
     */
    @Override
    public String toString(){
        String details="***Hobbit***";
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
