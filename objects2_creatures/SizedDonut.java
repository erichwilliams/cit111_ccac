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

public class SizedDonut {
    
    // member variable
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){

        percRemaining = percRemaining - percentEaten;
                System.out.println("Percent remaining of food: " + percRemaining);
    } //close method
    
    public int getPercRemaining(){
        return percRemaining;
    }//close method
} // close class