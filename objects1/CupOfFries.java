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

//Partially based off of an example given by our instructor, Eric Darsow,
//in regards to the simulateEating and getPercRemaining methods.

public class CupOfFries {
    
    // member variables
    private int percRemaining = 100;
    public String name;    
    public int calories;
    public boolean salt;
    public String Flavor;
    
        public void simulateEating(int percentEaten){
            percRemaining = percRemaining - percentEaten;
    }
    
        public int getPercRemaining(){
            return percRemaining;
    }
    
        public void salted(boolean salt_chosen){
            if(salt_chosen == true){
            Flavor = "Salted";
            calories = calories + 30;
            salt = true;}
            }
}