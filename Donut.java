/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Glitschen
 */

//Partially based off of an example given by our instructor, in regards to
//some variables and the simulateEating and getPercRemaining methods.

public class Donut {
    
    // member variables
    private int percRemaining = 100;
    public String name;    
    public int calories;
    public boolean glazed;
    public String Flavor;
    
        public void simulateEating(int percentEaten){
            percRemaining = percRemaining - percentEaten;
    }
    
        public int getPercRemaining(){
            return percRemaining;
    }
            public void glaze(boolean glazed_chosen){
            if(glazed_chosen == true){
            Flavor = "Glazed";
            calories = calories + 60;
            }
            
            }
}