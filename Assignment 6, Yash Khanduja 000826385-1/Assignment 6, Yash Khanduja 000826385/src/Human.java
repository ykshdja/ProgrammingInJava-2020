/*
 * Human is super class of fighter and wizards
 * @author  Yash Khanduja, 000826385
 * @since 2020 07 23
 *
 */
package fakeworld;


public abstract class Human extends fakeworld.Humanoid {
    //Elf is the humanoids enemy
    protected Elf enemy;
    protected String name;

    /**
     *@return the enemy
     */
    public Elf getElf() {
        return enemy;
    }

    /**
     *@param enemy of the human
     */
    public void setElf(Elf enemy) {
        this.enemy = enemy;
    }


}

