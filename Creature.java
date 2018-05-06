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

public class Creature {
    
    public String name;
    public String species;
    
    private int biteSizeInPercent;
    private int favDonutSize;
    
    public void eatDonut(SizedDonut donutToEat){
            System.out.println("Eating " +
                    biteSizeInPercent + " percent of " + donutToEat.name);
            donutToEat.simulateEating(biteSizeInPercent);
    }
    
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    }
    
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0){
        this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("No negative sizes, please!");
        }
    }
    
    public void setMinDonutSizeinmm(int favoriteToSet){
        if(favoriteToSet > 4){
            this.favDonutSize = favoriteToSet;
            System.out.println("I want food at least " + favoriteToSet + "mm big!");
        } else {
                System.out.println("Ew, no sizes below 4!");
            }
        }
    
    public void getMinDonutSizeinmm(){
        System.out.println("As I said, I want food at least " + favDonutSize + "mm big");
    }
}