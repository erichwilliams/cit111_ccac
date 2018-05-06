/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Glitschen
 */

//Very slightly modified version of example code provided by
//Professor Darsow, for a brief code exercise

public class CreatureLand {
    
    public static void main(String[] args){
        
    System.out.println("Creating a new friend! ");
    Creature tiger;
    tiger = new Creature();
    
    tiger.name = "Jimmy";
    tiger.species = "Tiger";
    
    tiger.setBiteSizeInPercent(5);
    tiger.setMinDonutSizeinmm(10);
    tiger.getMinDonutSizeinmm();
    
    System.out.println("Creating his or her food... ");
    SizedDonut donutForTiger = new SizedDonut();
    donutForTiger.name = "Dunky";
    donutForTiger.sizeInmm = 16;

    System.out.println("He or she is eating it now.");
    tiger.eatDonut(donutForTiger);
    
        System.out.println("Finished!");
    }
}