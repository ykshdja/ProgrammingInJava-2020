/*
 * To test other classes
 * @author  Yash Khanduja, 000826385
 * @since   2020-07-23
 */
package fakeworld;


public class Test {

    public static void main(String args[]){
        System.out.println("------Testing With Main Method------");
        fakeworld.Hobbit hob=new fakeworld.Hobbit("Hob",10,15,3,15,10,15);
        System.out.println(hob);
        System.out.println("Stealing score:"+hob.steal());
        hob.decreaseArmour();
        System.out.println("Hob After decreasing armour:"+hob.getArmour());
        hob.increaseArmour();
        System.out.println("Hob After increasing armour:"+hob.getArmour());
        Elf effi=new Elf("Effi",20,14,9,12,3,"Forest",hob,10);
        System.out.println(effi);
        effi.increaseStrength();
        System.out.println("Effi attack damage:"+effi.attact());
        System.out.println(effi.getName()+" after increasing strength:"+effi.getStrength());
        effi.decreaseStrength();
        System.out.println(effi.getName()+" after decreasing strength:"+effi.getStrength());
        fakeworld.Fighter rock=new fakeworld.Fighter("Rock",18,18,18,18,18,effi,15);
        System.out.println(rock);
        System.out.println("Fighter attack damage:"+rock.attact());

        fakeworld.Wizard wiz=new fakeworld.Wizard("Wiz",18,18,18,18,18,effi,15,15);
        System.out.println(wiz);
        System.out.println(wiz.getName()+" healing score "+wiz.heal());
        System.out.println(wiz.getName()+" magic point after healing "+wiz.getMagicRating());

        //using default constructor
        fakeworld.Wizard wza=new fakeworld.Wizard("Wza");
        System.out.println(wza);
        fakeworld.Hobbit hox=new fakeworld.Hobbit("Hox");
        System.out.println(hox);
        Elf exxo=new Elf("Exxo");
        System.out.println(exxo);
        fakeworld.Fighter rack=new fakeworld.Fighter("Rack");
        System.out.println(rack);



    }

}
